package Junitcucumber.stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static Junitcucumber.stepsDefinitions.Hooks.*;
import static Junitcucumber.stepsDefinitions.Hooks.driver;

public class PageConnexion {
    @Given("Je vais sur le site {string}")
    public void jeVaisSurLeSite(String arg0) {
        driver.get(arg0);
    }

    @When("Je clic sur le champs Email ou n° de téléphone")
    public void jeClicSurLeChampsEmailOuNDeTéléphone(){
        driver.findElement(By.cssSelector("#inputPhoneNumber")).click();
    }

    @Then("Je saisie mon identifiant {string}")
    public void jeSaisieMonIdentifiant(String arg0) throws InterruptedException {
        driver.findElement(By.cssSelector("#inputPhoneNumber")).sendKeys("0638614142");
        waitForAnElement(By.cssSelector("#inputPhoneNumber"));
    }

    @When("Je clic sur le champs Code pin")
    public void jeClicSurLeChampsCodePin() {
        driver.findElement(By.cssSelector("#inputSmsCode")).click();
    }

    @Then("Je saisie mon mot de passe {string}")
    public void jeSaisieMonMotDePasse(String arg0){
        driver.findElement(By.cssSelector("#inputSmsCode")).sendKeys("44506");
        waitForAnElement(By.cssSelector("#inputSmsCode"));
    }

    @When("Tu as finis de saisir ton identifiant et mot de passe")
    public void tuAsFinisDeSaisirTonIdentifiantEtMotDePasse() throws InterruptedException {
       /* String Identifiant = driver.findElement(By.cssSelector("#inputPhoneNumber")).getText();
        String MotDePasse = driver.findElement(By.cssSelector("#inputSmsCode")).getText();
        String ChaineVide = "";
        // Permet d'identifier avec une méthode, une condition Si c'est vrai continue le test sinon arrête le test
        Assert.assertTrue(!Objects.equals(Identifiant, ChaineVide) && !Objects.equals(MotDePasse, ChaineVide));
        */

    }

    @Then("Tu appuies sur le bouton se connecter")
    public void tuAppuiesSurLeBoutonSeConnecter() {
        driver.findElement(By.cssSelector("#connexion.btn.w-50.mt-3")).click();
    }

    @And("Tu arrives sur une nouvelle page")
    public void tuArrivesSurUneNouvellePage(){
        waitForAnElement(By.cssSelector("#connexion.btn.w-50.mt-3"));
        String SiteUrl = "https://sign.m2iformation.fr/signin";
        String SiteNewUrl = driver.getCurrentUrl();
        String UrlAttendu = "https://sign.m2iformation.fr/student";
        Assert.assertTrue(!Objects.equals(SiteNewUrl, SiteUrl) && Objects.equals(SiteNewUrl, UrlAttendu));
    }
}