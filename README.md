# samplegraphql

This is a springboot API application with minimal code. Queries are also provided to help beginners.

This project has 6 GraphQL API's -->
1) Create Actor Record - This is easiest API to understand how to call a mutation.
2) Create Song Records - Demonstrates how to use list. 
3) Create Movies Records - This has multiple lists and has more processing logic.
4) Get List of Actors - This is easiest API to understand how to call a query.
5) Get List of Songs
6) Get List of movies as per actor name

To keep the application simple and to the scope I have used map to hold data in memory instead of using persistence.

Running the app:
1) Checkout the code 
2) The application uses spring boot and maven. If eclipse, STS or Intellij is used for running the application then you can directly use the run option provided by the IDE. Else execute "mvn spring-boot :run" from command prompt.
3) Open graphiql url from browser using URL http://localhost:8080/graphiql
4) Refer graphql_test.txt file for sample mutations and queries and use them in the graphiql window.


 

