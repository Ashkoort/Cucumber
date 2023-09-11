package serenity.StepsDefinitions.Bugfus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Bugfus extends PageObject {

    @FindBy(xpath = "//div[@class=\"ak-block-btns\"]//button[contains(@class, \"ak-accept\")]")
    WebElementFacade acceptAllCookieButton;

    @FindBy(xpath = "//a[@class =\"ak-continue-website\"]")
    WebElementFacade preHomeContinue;

    @FindBy(xpath = "//div[contains(@class, \"ak-submenu-content\")]//a[contains(@href, \"tutoriels\")]")
    WebElementFacade tutorielButton;

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
    public void unUtilisateurCliqueSurApprendreÀJouer() {
    }

    @Then("Un utilisateur arrive sur le forum des tutoriels")
    public void unUtilisateurArriveSurLeForumDesTutoriels() {
    }
}
