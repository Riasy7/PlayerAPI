# LaLigaStats

LaLigaStats is a Spring Boot application that provides a RESTful API for retrieving player statistics for the LaLiga Football Fantasy game.

## Features

- Retrieve all players
- Retrieve players by name, team, nation, or position
- Retrieve players by team and position

## Technologies Used

- Java 11
- Spring Boot
- Spring Data JPA
- PostgreSQL

## Setup

1. Go to the [Spring Initializr](https://start.spring.io/) website.
2. Select the following options:
   - Project: Maven Project
   - Language: Java
   - Spring Boot: The latest stable version
   - Project Metadata:
     - Group: com.example
     - Artifact: LaLigaStats
   - Packaging: Jar
   - Java: 11
3. Add the following dependencies: Spring Web, Spring Data JPA, PostgreSQL Driver.
4. Click on the "Generate" button to download a ZIP file of the project.
5. Extract the ZIP file to a directory of your choice.
6. Open the project in your favorite IDE.

## Project Structure

- `Player`: This is the entity class that represents a player in the database. It's annotated with `@Entity` to indicate that it's a JPA entity.
- `PlayerRepository`: This is the repository interface for performing CRUD operations on `Player` entities. It extends `JpaRepository` and includes a custom method for finding a player by name.
- `PlayerService`: This is the service class that contains the business logic for handling `Player` data. It uses `PlayerRepository` to interact with the database.
- `PlayerController`: This is the controller class that handles HTTP requests. It uses `PlayerService` to retrieve the data that should be sent in the HTTP response.
- `PlayerConfig`: This is a configuration class that uses a `CommandLineRunner` to populate the database with some initial `Player` data at application startup.

## Running the Application
1. Build the project with Maven
   ```
   ./mvnw clean install
   ```
2. Run the Application
   ```
   ./mvnw spring-boot:run
   ```
The application will be accessible at `http://localhost:8080`.

## Database

The application uses a PostgreSQL database. The database is automatically populated with some initial data at application startup. The database was populated using the data scraping program that I made to scrape LaLiga stats of players. Please refer to my other repository for the code of that program: https://github.com/Riasy7/Football-Stats-Data-Scraping

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.


   
