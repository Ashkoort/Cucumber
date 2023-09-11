package serenity.StepsDefinitions.Bugfus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class goToStore extends PageObject {

    @FindBy(xpath = "//a[@class=\"external\"]")
    WebElementFacade inputStore;
    @FindBy(xpath = "//button[@class=\"btn btn-lg btn-primary mb-3\"]")
    WebElementFacade inputCookieStore;
    @FindBy(xpath = "//div[contains(@class, \"title\") and contains(text(),\"boutique Dofus\")]")
    WebElementFacade verifyPageStore;

    @When("Un utilisateur clique sur Boutique  en haut à droite de la page")
    public void unUtilisateurCliqueSurBoutiqueEnHautÀDroiteDeLaPage() {inputStore.click();}

    @Then("Il arrive sur le site de la boutique")
    public void ilArriveSurLeSiteDeLaBoutique() {
        ArrayList<String> tabs2 = new ArrayList<String> (getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(1));
        inputCookieStore.withTimeoutOf(10, ChronoUnit.SECONDS).waitUntilPresent();
        inputCookieStore.click();
        verifyPageStore.isVisible();
        Assert.assertTrue(verifyPageStore.isVisible());
    }
}
