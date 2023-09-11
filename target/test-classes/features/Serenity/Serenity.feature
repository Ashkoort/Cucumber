Feature: Site M2iformation

  @demo1
  Scenario Outline: Connexion site réussi
    Given Je me connecte sur le site <url>
    When Je saisie sur le champs Full name <name>
    When Je saisie sur le champs Email <mail>
    When Je saisie sur le champs Current address <adress>
    When Je remplis le champs Permanent Adresse par <Permanent_adress>
    Then Je clic sur submit du formulaire
    Examples:
      | url                          | name      | mail                  | adress                           | Permanent_adress                                 |
      | "https://demoqa.com/text-box" | "Gus Toto" | "test@m2iformation.fr" | "148 rue du test, 59260, Lille" | "356 rue du test fini, 80000, Amiens" |
      | "https://demoqa.com/text-box" | "Gus2 " | "test2@m2iformation.fr" | "148 rue du test, 59260, Lille" | "356 rue du test fini, 80000, Amiens" |
      | "https://demoqa.com/text-box" | "Gus3 " | "test3@m2iformation.fr" | "148 rue du test, 59260, Lille" | "356 rue du test fini, 80000, Amiens" |

  Rule: Login Client
    Background: Lance le site et accepte les cookies
      Given Un utilisateur sur le site "https://www.decathlon.fr/"
      When Il accepte les cookies

  @Decathlon
  Scenario Outline: Login un compte client
    When Le client clique sur le bouton Mon compte
    And Le client renseigne son mail dans le champs Email <mail>
    And Le client clique sur le bouton suivant
    And Le client renseigne dans le champs saisissez mot de passe <pwd>
    And Le client appuie sur le bouton valider
    Then il arrive sur une nouvelle page en étant connecté
    Examples:
      | mail                               | pwd            |
      | "toucrucroiligra-4676@yopmail.com" | "vac123!VAC123*" |

  @Decathlon
  Scenario Outline: le client selectionne un tshirt
    Given le client est déjà connecté <mail> <pwd>
    When le client écrit tshirt dans la barre de recherche : recherche un produit, un sport ou une reference
    And il appuie sur entrer
    And il clique sur le premier produit dans la catégorie produit
    And il selectionne la taille L
    And il clique sur le bouton jaune ajouter au panier
    Then il clique sur le bouton gris : continuer mes achats qui est dans la pop up
    Examples:
      | mail                               | pwd              |
      | "toucrucroiligra-4676@yopmail.com" | "vac123!VAC123*" |

  @Decathlon
  Scenario Outline: Recherche de vélo par filtre
    When Il clique sur equipement dans la barre de navigation
    And il clique sur mobilité
    And Dans mobilité il clique sur Sorties à Vélo
    And Il scroll jusqu'à voir la catégorie FILTRER PAR COULEURS sur la gauche
    And Il clique sur la couleur Noir
    And Il remonte la page jusqu'à voir la catégorie FILTRER PAR NATURE DE PRODUIT sur la gauche
    And Dans la catégorie FILTRER PAR NATURE DE PRODUIT il clique sur Vélo électrique
    And Dans la catégorie FILTRER PAR GENRES il clique sur Homme
    And Il scroll jusqu'à voir la catégorie FILTRER PAR SPORT
    And Il clique sur Vélo ville
    And Il scroll jusqu'à voir la catégorie FILTRER PAR PRIX
    And Il clique sur la case contenant le prix le plus élevé et mettre <prix>
    And Il remonte en haut de la page
    And Il clique sur le filtre à droite qui se nomme Meilleurs ventes
    And Il le remplace par Prix croissant
    Then L'ensemble des produits est trié en fonction des filtres
    And Il clique sur le premier produit
    Then Il arrive sur un vélo électrique
    Examples:
      | prix   |
      | "2000" |

  Rule: Et puis nouvelle règle

  @Decathlon
  Scenario Outline: Ceci est un test alakon du logo decat
    Given Un utilisateur sur le site "https://www.decathlon.fr/"
    When Il accepte les cookies

