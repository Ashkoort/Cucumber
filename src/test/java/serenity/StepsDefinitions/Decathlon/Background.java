package serenity.StepsDefinitions.Decathlon;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class Background extends PageObject {
    @FindBy(css = "#didomi-notice-agree-button.didomi-components-button.didomi-button.didomi-dismiss-button.didomi-components-button--color.didomi-button-highlight.highlight-button")
    WebElementFacade InputValiderCookie;

    @Given("Un utilisateur sur le site {string}")
    public void unUtilisateurSurLeSite(String arg0) {
        openAt(arg0);
    }

    @When("Il accepte les cookies")
    public void ilAccepteLesCookies() {
        InputValiderCookie.click();
    }
}
