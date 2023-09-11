Feature: Test des bug du site dofus
  Background: Lance le site dofus et accepte les cookies
    Given Un utilisateur sur le site "https://www.dofus.com/fr/prehome"
    And Un utilisateur accepte tout les cookies dofus
    And Un utilisateur clique sur continuer

  @Dofus
  Scenario: Tutoriel
    When Un utilisateur clique sur Apprendre à jouer
    Then Un utilisateur arrive sur le forum des tutoriels