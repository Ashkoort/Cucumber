package serenity.StepsDefinitions.Bugfus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Bugfus extends PageObject {

    @FindBy(xpath = "//div[@class=\"ak-block-btns\"]//button[contains(@class, \"ak-accept\")]")
    WebElementFacade acceptAllCookieButton;

    @FindBy(xpath = "//a[@class =\"ak-continue-website\"]")
    WebElementFacade preHomeContinue;

    @Given("Un utilisateur accepte tout les cookies dofus")
    public void unUtilisateurAccepteToutLesCookiesDofus()
    {
        acceptAllCookieButton.click();
    }

    @And("Un utilisateur clique sur continuer")
    public void unUtilisateurCliqueSurContinuer() {
        preHomeContinue.click();
    }
}
