# RESTful API Santander Dev Week
<p align="center">
  <img src="https://pbs.twimg.com/profile_images/1674166602588119041/2myezzTy_400x400.jpg" alt="Santander Dev Week">
</p>


Java RESTful API desenvolvida durante a Santander Dev Week, que representa funcionalidades básicas de um sistema bancário.

## Sobre o Projeto

Este projeto é uma API RESTful desenvolvida como parte da Santander Dev Week. Ela oferece funcionalidades de um sistema bancário simples, como manipulação de usuários, contas, cartões e recursos associados.

A API foi desenvolvida em Java usando o framework Spring Boot, que é amplamente utilizado para construir aplicativos web e APIs robustas e eficientes. O projeto inclui um modelo de classe que representa um usuário de banco, conforme mostrado no diagrama de classes abaixo:

```mermaid
classDiagram
    class Usuario {
        - String name
        - Account account
        - List<Feature> features
        - Card card
        - List<News> news
        + getters/setters
    }

    class Account {
        - String accountNumber
        - String accountAgency
        - double accountBalance
        - double accountLimit
        + getters/setters
    }

    class Feature {
        - String icon
        - String description
        + getters/setters
    }

    class Card {
        - String number
        - double limit
        + getters/setters
    }

    class News {
        - String icon
        - String description
        + getters/setters
    }

    Usuario -- Account
    Usuario -- Feature
    Usuario -- Card
    Usuario -- News
