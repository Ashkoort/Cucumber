package serenity.StepsDefinitions.Decathlon;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RechercheParFiltre extends PageObject {

    @FindBy(css = "ul[role=\"menubar\"] > li:nth-child(5)")
    WebElementFacade InputEquipement;
    @FindBy(css = ".menubar--expansion-panel .menubar--panel-nav .vtmn-flex:nth-child(4) a[href=\"/browse/c0-equipements-loisirs/c1-mobilite/_/N-8lcmhk\"]")
    WebElementFacade InputMobilite;
    @FindBy(css = "a[href=\"/browse/c0-equipements-loisirs/c1-mobilite/c2-sorties-a-velo/_/N-h49kfi\"]")
    WebElementFacade InputSortiVelo;
    @FindBy(css = "article:nth-child(7) > div a:first-child")
    WebElementFacade FiltreCouleurs;
    @FindBy(css = "a[title=\"noir\"]")
    WebElementFacade InputCouleursNoir;
    @FindBy(css = "article:first-child")
    WebElementFacade FilterNatureProduct;
    @FindBy(css = "article:first-child  a:nth-child(3)")
    WebElementFacade InputElectricBike;
    @FindBy(css = "article:nth-child(2) a:nth-child(2)")
    WebElementFacade InputMen;


    @When("Il clique sur equipement dans la barre de navigation")
    public void ilCliqueSurEquipementDansLaBarreDeNavigation() {
        InputEquipement.click();
    }

    @And("il clique sur mobilité")
    public void ilCliqueSurMobilité() {InputMobilite.click();}

    @And("Dans mobilité il clique sur Sorties à Vélo")
    public void dansMobilitéIlCliqueSurSortiesÀVélo() {
        InputSortiVelo.click();
    }

    @And("Il scroll jusqu'à voir la catégorie FILTRER PAR COULEURS sur la gauche")
    public void ilScrollJusquÀVoirLaCatégorieFILTRERPARCOULEURSSurLaGauche() {
        getJavascriptExecutorFacade().executeScript("arguments[0].scrollIntoView();", FiltreCouleurs);
    }

    @And("Il clique sur la couleur Noir")
    public void ilCliqueSurLaCouleurNoir() {InputCouleursNoir.click();}

    @And("Il remonte la page jusqu'à voir la catégorie FILTRER PAR NATURE DE PRODUIT sur la gauche")
    public void ilRemonteLaPageJusquÀVoirLaCatégorieFILTRERPARNATUREDEPRODUITSurLaGauche() {
        getJavascriptExecutorFacade().executeScript("arguments[0].scrollIntoView();", FilterNatureProduct);
    }

    @And("Dans la catégorie FILTRER PAR NATURE DE PRODUIT il clique sur Vélo électrique")
    public void dansLaCatégorieFILTRERPARNATUREDEPRODUITIlCliqueSurVéloÉlectrique() {InputElectricBike.click();}

    @And("Dans la catégorie FILTRER PAR GENRES il clique sur Homme")
    public void dansLaCatégorieFILTRERPARGENRESIlCliqueSurHomme() {InputMen.click();}

    @And("Il scroll jusqu'à voir la catégorie FILTRER PAR SPORT")
    public void ilScrollJusquÀVoirLaCatégorieFILTRERPARSPORT() {
    }

    @And("Il clique sur Vélo ville")
    public void ilCliqueSurVéloVille() {
    }

    @And("Il scroll jusqu'à voir la catégorie FILTRER PAR PRIX")
    public void ilScrollJusquÀVoirLaCatégorieFILTRERPARPRIX() {
    }

    @And("Il clique sur la case contenant le prix le plus élevé et mettre {string}")
    public void ilCliqueSurLaCaseContenantLePrixLePlusÉlevéEtMettre(String arg0) {
    }

    @And("Il remonte en haut de la page")
    public void ilRemonteEnHautDeLaPage() {
    }

    @And("Il clique sur le filtre à droite qui se nomme Meilleurs ventes")
    public void ilCliqueSurLeFiltreÀDroiteQuiSeNommeMeilleursVentes() {
    }

    @And("Il le remplace par Prix croissant")
    public void ilLeRemplaceParPrixCroissant() {
    }

    @Then("L'ensemble des produits est trié en fonction des filtres")
    public void lEnsembleDesProduitsEstTriéEnFonctionDesFiltres() {
    }

    @And("Il clique sur le premier produit")
    public void ilCliqueSurLePremierProduit() {
    }

    @Then("Il arrive sur un vélo électrique")
    public void ilArriveSurUnVéloÉlectrique() {
    }
}
