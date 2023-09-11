package serenity.StepsDefinitions.Bugfus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Bugfus extends PageObject {

    @FindBy(xpath = "//div[@class=\"ak-block-btns\"]//button[contains(@class, \"ak-accept\")]")
    WebElementFacade acceptAllCookieButton;

    @FindBy(xpath = "//a[@class =\"ak-continue-website\"]")
    WebElementFacade preHomeContinue;

    @FindBy(xpath = "//div[contains(@class, \"ak-submenu-content\")]//a[contains(@href, \"tutoriels\")]")
    WebElementFacade tutorielButton;

    @FindBy(xpath = "//a[@class=\"ak-dropbtn\" and @drop-index=\"0\"]")
    WebElementFacade gamePannel;

    @FindBy(xpath = "//h1[@class=\"ak-return-link\" and contains(text()[2], \"Tutoriels\")]")
    WebElementFacade tutorielHeader;

    @Given("Un utilisateur accepte tout les cookies dofus")
    public void unUtilisateurAccepteToutLesCookiesDofus()
    {
        acceptAllCookieButton.click();
    }

    @And("Un utilisateur clique sur continuer")
    public void unUtilisateurCliqueSurContinuer() {
        preHomeContinue.click();
    }

    @When("Un utilisateur clique sur Apprendre à jouer")
    public void unUtilisateurCliqueSurApprendreAJouer() {
        Actions action = new Actions(getDriver());
        action.moveToElement(gamePannel).perform();
        tutorielButton.click();
    }

    @Then("Un utilisateur arrive sur le forum des tutoriels")
    public void unUtilisateurArriveSurLeForumDesTutoriels() {
        Assert.assertTrue(tutorielHeader.isVisible());
    }
}
