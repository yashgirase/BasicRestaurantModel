# BasicRestaurantModel
Basic restaurant model is a Java application built using Maven and the SpringBoot framework.

## Table of Contents

- [Frameworks and Language Used](#frameworks-and-language-used)
- [Dataflow](#dataflow)
- [Data Structure](#data-structure)
- [Project Summary](#project-summary)

## Frameworks and Language Used

- Java: The primary programming language used for developing the application.
- Maven: A build automation tool and dependency management tool used for managing the project's dependencies and building the application.
- SpringBoot: A powerful and widely used framework for building Java-based enterprise applications. It provides features like inversion of control, dependency injection, and seamless integration with various other libraries.

## Dataflow
* Controller : In controller class I have exposed APIs for each operation like addRestaurant , getRestaurantByUsingId , getAllRestaurant , updateRestaurantSpeciality and deleteRestaurent.

* Service : In Service class I have written the logic for each of API method and return it.

* Repository : In Repository class I have created reference for for Arraylist and by dependency injection I got the object of it from bean factory which is basically a configuration class.

* DataBase Design : For to store deta of users I have used Arraylist as I feel it is easy to manupulate over Arraylist.

## Data Structure

 I have used Arraylist to maintain the list of users as It is easy to manupulate over Arraylist than other deta structures.

## Project Summary

I have created basic SpringBoot application which is basic restaurent model. Which is basically to store the details about restaurants and to get the details of restaurants for users. I have exposed APIs for each operation like addRestaurant , getRestaurantByUsingId , getAllRestaurant , updateRestaurantSpeciality and deleteRestaurent.
