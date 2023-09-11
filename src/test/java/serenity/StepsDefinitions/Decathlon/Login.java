package serenity.StepsDefinitions.Decathlon;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.OpenAt;

public class Login extends PageObject {

    @FindBy(css = ".tool-link.svelte-qkt0mt[href=\"/account/dashboard\"]")
    WebElementFacade InputMonCompte;

    @FindBy(css = "#input-email")
    WebElementFacade InputEmail;

    @FindBy(css = "#lookup-btn")
    WebElementFacade InputSuivant;

    @FindBy(css = "#input-password")
    WebElementFacade InputePassWord;

    @FindBy(css = "#signin-button")
    WebElementFacade InputValider;

    @FindBy(css = ".accountid.vtmn-mt-2.vtmn-py-1.vtmn-px-2.svelte-1gaio7k")
    WebElementFacade IdConnexion;


    @When("Le client clique sur le bouton Mon compte")
    public void leClientCliqueSurLeBoutonMonCompte() {
        InputMonCompte.click();
    }

    @And("Le client renseigne son mail dans le champs Email {string}")
    public void leClientRenseigneSonMailDansLeChampsEmail(String arg0) {InputEmail.sendKeys(arg0);}

    @And("Le client clique sur le bouton suivant")
    public void leClientCliqueSurLeBoutonSuivant() {
        InputSuivant.click();
    }

    @And("Le client renseigne dans le champs saisissez mot de passe {string}")
    public void leClientRenseigneDansLeChampsSaisissezMotDePasse(String arg0) {
        InputePassWord.sendKeys(arg0);
    }

    @And("Le client appuie sur le bouton valider")
    public void leClientAppuieSurLeBoutonValider() {
        InputValider.click();
    }

    @Then("il arrive sur une nouvelle page en étant connecté")
    public void ilArriveSurUneNouvellePageEnÉtantConnecté() {
        IdConnexion.isDisplayed();
    }

}
