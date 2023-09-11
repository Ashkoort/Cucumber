import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\apache-maven-3.9.4\\drivers\\chromedriver-win32\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://sign.m2iformation.fr/signin");
        driver.findElement(By.cssSelector("#inputPhoneNumber")).sendKeys("0638614142");
        driver.findElement(By.cssSelector("#inputSmsCode")).sendKeys("44506");
        driver.findElement(By.cssSelector("#connexion.btn.w-50.mt-3")).click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElement(By.cssSelector(".main_nav  > li:nth-child(2) > a")).click();
        Mydate();
        driver.findElement(By.id(Mydate().toLowerCase())).click();
        driver.findElement(By.cssSelector("div.login_button a")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.close();
    }
    // Une fonction qui permet de retrouvé la date actuelle
    public static String Mydate(){
        DateFormat format = new SimpleDateFormat("MM/dd/yyyya");
        //obtenir la date courante
        Date date = new Date();
        System.out.println(format.format(date));
        return format.format(date);

    }
}
