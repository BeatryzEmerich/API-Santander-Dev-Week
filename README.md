# APISantanderDevWeek
### Java RESTIful API desenvolvida no Santander Dev Week
## Aqui se encontra o Diagrama de Classes utilizado
``` mermaid
classDiagram
  class Usuario {
    + String name
    + Account account
    + Feature[] features
    + Card card
    + News[] news
  }
  
  class Account {
    + String accountNumber
    + String accountAgency
    + Float accountBalance
    + Float accountLimit
  }
  
  class Feature {
    + String icon
    + String description
  }
  
  class Card {
    + String number
    + Float limit
  }
  
  class News {
    + String icon
    + String description
  }
  
  Usuario --> Account
  Usuario --> Feature
  Usuario --> Card
  Usuario --> News
```
