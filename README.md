# Epam Week-3 Project

- Project done in Maven by implementing the SOLID KISS and DRY principles
- Maven Project Creation Process:

**Step 1:** *Checking the installation of Maven in the system*
```s
mvn --version
```
**Step 2:** *Creating Maven project through command line*
```s
mvn archetype:generate -DgroupId=com.mycompany.calculator -DartifactId=calculator -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```
**Step 3:** *Build the Maven Project*
```s
mvn package
```
**Step 4:** *Testing the Maven Project*
```s
mvn test
```

# Project Idea

>A calculator is implemented using the add,divide,subtract and multiplication operations.
>A class operations is created in package and the methods for the operations are implemented there
>Another class calculator is created to call these operations of same package.
>Layered Architecture is implemented as a two-tier Architecture.UI is done through console and logic is implemented in classes.
