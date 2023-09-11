Feature: Test des bug du site dofus
  Background: Lance le site dofus et accepte les cookies
    Given Un utilisateur sur le site "https://www.dofus.com/fr/prehome"
    And Un utilisateur accepte tout les cookies dofus
    And Un utilisateur clique sur continuer

  @Dofus
  Scenario: Boutique
    When Un utilisateur clique sur Boutique  en haut à droite de la page
    Then Il arrive sur le site de la boutique