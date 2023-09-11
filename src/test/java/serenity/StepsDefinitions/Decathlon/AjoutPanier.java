package serenity.StepsDefinitions.Decathlon;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

import java.time.temporal.ChronoUnit;
import java.util.List;

import static org.bouncycastle.asn1.iana.IANAObjectIdentifiers.mail;

public class AjoutPanier extends PageObject {
    @FindBy(css = ".accountid.vtmn-mt-2.vtmn-py-1.vtmn-px-2.svelte-1gaio7k")
    WebElementFacade IdConnexion;
    @FindBy(css =".svelte-yqk2xn[type=\"search\"]")
    WebElementFacade InputRecherche;
    @FindBy(css ="div.product-list [role=\"listitem\"] a.vtmn-absolute")
    List<WebElementFacade> listProduit;
    @FindBy(css =".svelte-1coipcv[type=\"button\"]")
    WebElementFacade SelectionTaille;
    @FindBy(css = "ul[id=\"product-size-selection-listbox\"]> li:nth-child(3)")
    WebElementFacade SelectionL;
    @FindBy(css =".buying-zone .cta[type=\"button\"]")
    WebElementFacade InputAjoutPanier;
    @FindBy(css ="section div .cta:nth-child(2)")
    WebElementFacade InputContinuerAchat;

    Login login = new Login();

    @Given("le client est déjà connecté {string} {string}")
    public void leClientEstDéjàConnecté(String mail,String pwd) {
        login.leClientCliqueSurLeBoutonMonCompte();
        login.leClientRenseigneSonMailDansLeChampsEmail(mail);
        login.leClientCliqueSurLeBoutonSuivant();
        login.leClientRenseigneDansLeChampsSaisissezMotDePasse(pwd);
        login.leClientAppuieSurLeBoutonValider();
        login.ilArriveSurUneNouvellePageEnÉtantConnecté();
        IdConnexion.click();
    }

    @When("le client écrit tshirt dans la barre de recherche : recherche un produit, un sport ou une reference")
    public void leClientÉcritTshirtDansLaBarreDeRechercheRechercheUnProduitUnSportOuUneReference() {
        InputRecherche.sendKeys("tshirt");
    }

    @And("il appuie sur entrer")
    public void ilAppuieSurEntrer() {
        InputRecherche.sendKeys(Keys.ENTER);
    }

    @And("il clique sur le premier produit dans la catégorie produit")
    public void ilCliqueSurLePremierProduitDansLaCatégorieProduit() {
        listProduit.get(0).click();
    }

    @And("il selectionne la taille L")
    public void ilSelectionneLaTailleL() {
        SelectionTaille.click();
        SelectionTaille.withTimeoutOf(10, ChronoUnit.SECONDS).waitUntilPresent();
        SelectionL.click();
        getJavascriptExecutorFacade().executeScript("window.scrollBy(0,600)");
    }

    @And("il clique sur le bouton jaune ajouter au panier")
    public void ilCliqueSurLeBoutonJauneAjouterAuPanier() {
        InputAjoutPanier.click();
    }

    @Then("il clique sur le bouton gris : continuer mes achats qui est dans la pop up")
    public void ilCliqueSurLeBoutonGrisContinuerMesAchatsQuiEstDansLaPopUp() {
        InputContinuerAchat.click();
    }
}
