# Anderlechtse NGO Evenementen Applicatie

## Beschrijving
Dit is een webapplicatie voor het beheren van evenementen van de Anderlechtse NGO.  
Gebruikers kunnen evenementen bekijken, nieuwe evenementen toevoegen, en details van elk evenement inzien.

## Functionaliteiten
- Overzicht van de laatste 10 evenementen
- Details van een specifiek evenement bekijken
- Nieuwe evenementen toevoegen via een formulier
- Overzichtspagina en About-pagina met algemene info

## Technologieën
- Java 17
- Spring Boot
- Thymeleaf (voor server-side templating)
- Tailwind CSS (voor styling)
- Maven (voor dependency management)

## Structuur van de projectmappen
- `src/main/resources/templates/events` - HTML templates voor de evenementenpagina's
- `src/main/java/com/ngo/tinus_houben/controller` - Controllers (zoals EventController)
- `src/main/java/com/ngo/tinus_houben/service` - Services voor businesslogica
- `src/main/java/com/ngo/tinus_houben/model` - Data modellen (zoals Event)

## Installatie en gebruik
1. Zorg dat Java en Maven geïnstalleerd zijn.
2. Clone deze repository:
   ```bash
   git clone https://github.com/TinusHouben/Project-Enterprise/tree/main
