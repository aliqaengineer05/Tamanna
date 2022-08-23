AUTHOR AHMED ALI

# serenity-bdd-screenplay-cucumber framework for Tamanna

This is a test automation framework with serenity-bdd-screenplay & cucumber that run tests on Ecommerce site (https://www.tamanna.com/)
## Screenplay implementation

These tests use Interactions ,tasks, questions and page elements defined in src/main/java/com/tamanna/userInterfaces

The screenplay package structure is shown below:
````
+ model
    Domain model classes
+ abilities
    Actor/User can do abilities
+ tasks
    Business-level tasks
+ user_interfaces
    Page Objects and Page Elements
+ questions
    Objects used to query the application
````

The above package structure is an idea to show how automation tests can be written implementing
screenplay design pattern and SOLID (Single Responsibility , Open/Closed, Liskov Substitution,
Interface Segregation, Depedency Injection) principles together using Serenity BDD framework.


## Get the code

Git:

    git clone https://github.com/aliqaengineer05/Tamanna.git

## Running the Project Using Gradle
Import the Project as gradle in idea and then perform the following actions 

1. Clean the Build
2. Build the gradle

## Running the Project Using Gradle
This requires webdriver setup. By default the tests run on Chrome, you need to set the latest chromedriver instance on your system path.

Open a command window and run: Testcases will run on chrome browser as well.
1. ./gradlew clean
2.   ./gradlew build
3.  ./gradlew test  (For windows)

These commands run Cucumber features using Cucumber's JUnit runner. The `@RunWith(CucumberWithSerenity.class)` annotation on the `PurchasesRunner`
class tells JUnit to kick off Cucumber.

## Viewing the reports
Serenity test report in the `target/site/serenity` directory. Go take a look!



## Tools and Language
````
+ intellij idea with gradle Plugin
+ Gradle
+ Serenity
+ Cucmber
+ ScreenPaly
+ JDK 11
+ Enviornment Variable like Java Home etc
````

## Automated Test cases
TestCAse #1
1. User open the URL ( )
2. User click on the Women
3. User click on the Women Sub category
4. User open the click on the product
5. User add to cart the product

TestCAse #2
1. User open the URL ( )
2. User click on the men
3. User click on the men Sub category
4. User open the click on the product
5. User add to cart the product

TestCAse #3
1. User click on the cart icon
2. User clicks on SHopping Bag
3. User Verify that the Total price
4. User Remove the item from cart
5. User Verify that Total price is zero
