package Junitcucumber.stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Objects;

import static Junitcucumber.stepsDefinitions.Hooks.driver;
import static Junitcucumber.stepsDefinitions.Hooks.waitForAnElement;

public class DemoqaForm {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @When("Je clic sur Forms")
    public void jeClicSurForms() {
        driver.findElement(By.cssSelector("div.card:nth-child(2)")).click();
    }

    @Then("J'arrive sur un nouvelle url")
    public void jArriveSurUnNouvelleUrl() {
        waitForAnElement(By.cssSelector("#connexion.btn.w-50.mt-3"));
        String SiteUrl = "https://demoqa.com/";
        String SiteNewUrl = driver.getCurrentUrl();
        String UrlAttendu = "https://demoqa.com/forms";
        Assert.assertTrue(!Objects.equals(SiteNewUrl, SiteUrl) && Objects.equals(SiteNewUrl, UrlAttendu));
    }

    @When("je clic sur Practice Form")
    public void jeClicSurPracticeForm() {
        waitForAnElement(By.cssSelector(".element-list.collapse.show ul.menu-list #item-0"));
        driver.findElement(By.cssSelector(".element-list.collapse.show ul.menu-list #item-0")).click();
    }

    @Then("Le formulaire s'affiche")
    public void leFormulaireSAffiche() {
        String SiteUrl = "https://demoqa.com/forms";
        String SiteNewUrl = driver.getCurrentUrl();
        String UrlAttendu = "https://demoqa.com/automation-practice-form";
        Assert.assertTrue(!Objects.equals(SiteNewUrl, SiteUrl) && Objects.equals(SiteNewUrl, UrlAttendu));

    }

    @Then("Je renseigne le champs First Name avec {string}")
    public void jeRenseigneLeChampsFirstNameAvec(String arg0) {
        driver.findElement(By.cssSelector("#firstName")).sendKeys(arg0);
    }

    @Then("Je renseigne le champs Last Name avec {string}")
    public void jeRenseigneLeChampsLastNameAvec(String arg0) {
        driver.findElement(By.cssSelector("#lastName")).sendKeys(arg0);
    }

    @Then("Je remplis le champs Email {string}")
    public void jeRemplisLeChampsEmail(String arg0) {
        driver.findElement(By.cssSelector("#userEmail")).sendKeys(arg0);
        js.executeScript("window.scrollBy(0,400)");
        waitForAnElement(By.cssSelector("#userEmail"));
    }

    @Then("Dans Gender je clic sur Male")
    public void dansGenderJeClicSurMale() {
        driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label")).click();
        waitForAnElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label"));
    }

    @Then("Je remplis le Champs Mobile {string}")
    public void jeRemplisLeChampsMobile(String arg0) {
        driver.findElement(By.cssSelector("#userNumber")).sendKeys(arg0);
    }

    @Then("Je remplis le champs Subjects {string}")
    public void jeRemplisLeChampsSubjects(String arg0) {
        driver.findElement(By.cssSelector("#subjectsInput")).sendKeys(arg0);
        js.executeScript("window.scrollBy(0,600)");
    }

    @Then("Dans Hobbies je clic sur Sports")
    public void dansHobbiesJeClicSurSports() {
    }

    @When("Je met un fichier dans Picture {string}")
    public void jeMetUnFichierDansPicture(String arg0) {
    }

    @Then("Je remplis le champs Current Adresse par {string}")
    public void jeRemplisLeChampsCurrentAdressePar(String arg0) {
    }

    @Then("Je choisis dans le champs Select State {string}")
    public void jeChoisisDansLeChampsSelectState(String arg0) {
    }

    @Then("Je choisis dans le champs Select city {string}")
    public void jeChoisisDansLeChampsSelectCity(String arg0) {
    }

    @Then("Je clic sur submit")
    public void jeClicSurSubmit() {
    }
}
