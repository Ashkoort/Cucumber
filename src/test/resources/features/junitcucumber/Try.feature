Feature: Site M2iformation

  @demo
  Scenario Outline: Connexion site réussi
    Given Je vais sur le site <url>
    When Je clic sur le champs Email ou n° de téléphone
    Then Je saisie mon identifiant <identifiant>
    When Je clic sur le champs Code pin
    Then Je saisie mon mot de passe <pwd>
    When Tu as finis de saisir ton identifiant et mot de passe
    Then Tu appuies sur le bouton se connecter
    And Tu arrives sur une nouvelle page
    Examples:
      | url                                  | identifiant        | pwd   |
      | "https://sign.m2iformation.fr/signin" | "0638614142" | "44506" |

  @demo
  Scenario Outline: Formulaire Demoqa
    Given Je vais sur le site <url>
    When Je clic sur Forms
    Then J'arrive sur un nouvelle url
    When je clic sur Practice Form
    Then Le formulaire s'affiche
    Then Je renseigne le champs First Name avec <name>
    Then Je renseigne le champs Last Name avec <nickname>
    Then Je remplis le champs Email <mail>
    Then Dans Gender je clic sur Male
    Then Je remplis le Champs Mobile <mobile>
    Then Je remplis le champs Subjects <sujet>
    Then Dans Hobbies je clic sur Sports
    When Je met un fichier dans Picture <picture>
    Then Je remplis le champs Current Adresse par <adresse>
    Then Je choisis dans le champs Select State <state>
    Then Je choisis dans le champs Select city <city>
    Then Je clic sur submit
    Examples:
      | url                  | name | nickname  | mail                             | mobile        | sujet  | picture                                                    | adresse                          | state | city   |
      | "https://demoqa.com/" | "Gus" | "Toto" | "Exemple.coucou@m2iformation.com" | "0623252425" | "Math" | "C:\ProjetTest\test\src\test\ressources\DemonSalyer.jpg" | "7 rue des test, 59260, Lille" | "NCR" | "Delhi" |