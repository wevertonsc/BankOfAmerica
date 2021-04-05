# Bank Of America - Assessment

This application is a microservice related to a Bank of America Assessement and implemented in Java 8, deployed by pipeline basede in GitHub and Heroku.
There is a database modeling in a pdf file in the main folder of repository, the name of this pdf is ERR-Diafram_Bank-of-America.pdf
The main ideia of this application is simulate an simple credit card authorizer, where da send information is send in JSON formata and compared with database information to validade and authorized buys.

The URL to access the microservice is documented in Swagger by URL below:

https://bank-of-america.herokuapp.com/swagger-ui.html

The Swagger can be used to test the webservice using the falow JSON structure for post /api/v1/operation

Sample of JSON

{
  "brand": "visa",
  "cvv": "000",
  "email": "leon.tolstoi@mail.com",
  "expiration": "12/2024",
  "name": "Leon Tolstoi",
  "number": "4882818360469654",
  "type": "buy",
  "value": 100.00
}

![image](https://user-images.githubusercontent.com/2213186/113527699-3c1c3480-95b6-11eb-9df5-159bb94af7ab.png)

Weverton de Souza Castanho
wevertonsc@gmail.com
Irland 05.APRIL.2021
