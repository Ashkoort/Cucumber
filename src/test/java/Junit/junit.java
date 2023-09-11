package Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor; // permet d'utilisé une fonction de scroll


import java.util.concurrent.TimeUnit;

public class junit {

    WebDriver driver;



    @BeforeAll
    static void setupAll(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterEach
    void teardown(){
        driver.quit();
    }
    @Test
    void test()throws InterruptedException{
        driver.get("https://selenium.dev");
        TimeUnit.SECONDS.sleep(5);
    }
    @Test
    void MyLogin()throws InterruptedException{
        driver.get("https://sign.m2iformation.fr/signin");
        driver.findElement(By.cssSelector("#inputPhoneNumber")).sendKeys("0638614142");
        driver.findElement(By.cssSelector("#inputSmsCode")).sendKeys("44506");
        driver.findElement(By.cssSelector("#connexion.btn.w-50.mt-3")).click();
        TimeUnit.SECONDS.sleep(10);
    }
    @Test
    void MyLoginFalse()throws InterruptedException{
            driver.get("https://sign.m2iformation.fr/signin");
            driver.findElement(By.cssSelector("#inputPhoneNumber")).sendKeys("0638614142");
            driver.findElement(By.cssSelector("#inputSmsCode")).sendKeys("445000");
            driver.findElement(By.cssSelector("#connexion.btn.w-50.mt-3")).click();
            TimeUnit.SECONDS.sleep(20);
            String a = driver.findElement(By.cssSelector("form.form-signin div#erreur-message")).getText();
            System.out.println(a);
    }
    @Test
    void PageAccueilDemoqa()throws InterruptedException{
        driver.get("https://demoqa.com/");
        driver.findElement(By.cssSelector("div.card:nth-child(3)")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.cssSelector("div.element-group:nth-child(1) .header-wrapper")).click();
        TimeUnit.SECONDS.sleep(7);
        driver.findElement(By.cssSelector("a[href=\"https://demoqa.com\"]")).click();
    }

    @Test
    void FormulaireDemoqa()throws InterruptedException{
        // setTimeout(function() {debugger;}, 3000); permet de freeze la page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        PageAccueilDemoqa();
        driver.findElement(By.cssSelector("div.card:nth-child(2)")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.cssSelector(".element-list.collapse.show ul.menu-list #item-0")).click();
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Gus");
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Gus");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("exempleMail@gmail.com");
        js.executeScript("window.scrollBy(0,400)");
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.cssSelector("#userNumber")).sendKeys("0637589802");
        //driver.findElement(By.cssSelector("#dateOfBirthInput")).click();
        driver.findElement(By.cssSelector("#subjectsInput")).sendKeys("Renseignement");
        js.executeScript("window.scrollBy(0,600)");
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.cssSelector("#uploadPicture")).sendKeys("C:\\ProjetTest\\test\\src\\test\\ressources\\DemonSalyer.jpg");
        driver.findElement(By.cssSelector("#currentAddress")).sendKeys("7 rue des test,59260, Lille");
        driver.findElement(By.cssSelector("#state div div.css-1wy0on6 .css-tlfecz-indicatorContainer")).click();
        js.executeScript("window.scrollBy(0,600)");
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.cssSelector("#react-select-3-option-1")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.cssSelector("#city")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.cssSelector("#react-select-4-option-0")).click();
        js.executeScript("window.scrollBy(0,600)");
        TimeUnit.SECONDS.sleep(5);
        js.executeScript("arguments[0].remove();",driver.findElement(By.tagName("footer")));
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.cssSelector("#submit")).sendKeys("ENTER");
        TimeUnit.SECONDS.sleep(10);
    }
}
