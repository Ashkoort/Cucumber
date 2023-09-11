package serenity.StepsDefinitions.DemoQa;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.temporal.ChronoUnit;


public class TestDemoqa extends PageObject {

    @FindBy(css = "#userName")
    WebElementFacade InputUserName;

    @FindBy(css = "#userEmail")
    WebElementFacade InputeUserEmail;

    @FindBy(css = "#currentAddress")
    WebElementFacade InputAdressTempo;

    @FindBy(css = "#permanentAddress")
    WebElementFacade InputAdressPrincipal;

    @FindBy(css = "#submit")
    WebElementFacade Submit;

    @Given("Je me connecte sur le site {string}")
    public void jeMeConnecteSurLeSite(String arg0) {
        openAt(arg0);
    }

    @When("Je saisie sur le champs Full name {string}")
    public void jeSaisieSurLeChampsFullName(String arg0) {
        InputUserName.sendKeys(arg0);
    }

    @When("Je saisie sur le champs Email {string}")
    public void jeSaisieSurLeChampsEmail(String arg0) {
        InputeUserEmail.withTimeoutOf(10, ChronoUnit.SECONDS).waitUntilPresent();
        InputeUserEmail.sendKeys(arg0);
    }

    @When("Je saisie sur le champs Current address {string}")
    public void jeSaisieSurLeChampsCurrentAddress(String arg0) {
        InputAdressTempo.withTimeoutOf(10, ChronoUnit.SECONDS).waitUntilPresent();
        InputAdressTempo.sendKeys(arg0);
        getJavascriptExecutorFacade().executeScript("window.scrollBy(0,600)");
    }

    @When("Je remplis le champs Permanent Adresse par {string}")
    public void jeRemplisLeChampsPermanentAdressePar(String arg0) {
        InputAdressPrincipal.withTimeoutOf(10, ChronoUnit.SECONDS).waitUntilPresent();
        InputAdressPrincipal.sendKeys(arg0);
    }

    @Then("Je clic sur submit du formulaire")
    public void jeClicSurSubmitDuFormulaire() {
        Submit.withTimeoutOf(10, ChronoUnit.SECONDS).waitUntilPresent();
        Submit.click();
    }
}
