# Projet : Clone Airbnb - Partie Backend (API)

## Description
Ce projet est une implémentation backend d'un clone d'Airbnb, développé avec **Java Spring Boot**. Il fournit une API RESTful permettant de gérer les fonctionnalités principales d'une plateforme de location de biens immobiliers.

L'objectif est de construire un système robuste pour la gestion des propriétés, des utilisateurs, des réservations, et d'autres aspects nécessaires à un site similaire à Airbnb.

---

## Fonctionnalités principales
### Propriétés (Properties)
- Ajouter, modifier, supprimer et consulter des propriétés.
- Pagination des résultats avec un maximum de 20 propriétés par page.
- Champs pris en charge : 
  - Nom de la propriété.
  - Description.
  - Prix par nuit.
  - Date de création et de mise à jour.

### Utilisateurs (Users)
- Création de comptes utilisateur (locataires et propriétaires).
- Authentification et gestion des rôles.

### Réservations (Bookings)
- Réservation de propriétés pour une période donnée.
- Validation des disponibilités avant réservation.

### Autres fonctionnalités
- Gestion des erreurs (ex. : 404, 500).
- Documentation Swagger pour tester facilement l'API.

---

## Technologies utilisées
### Backend
- **Java 17**
- **Spring Boot 3.x**
  - Spring Data JPA (gestion des bases de données).
  - Spring Web (création d'API RESTful).
  - Spring Security (authentification et autorisation).
- **Hibernate** (ORM pour la gestion des entités).
- **MySQL** (base de données relationnelle).
- **Lombok** (simplification du code).

### Outils de développement
- **Maven** (gestion des dépendances et du cycle de vie du projet).
- **Postman** (tests des endpoints API).
- **Swagger** (documentation interactive de l'API).

---

## Structure du projet
