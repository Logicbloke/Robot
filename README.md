# Robot Program

**Author:** Taha Zouhair

## Overview
The first input is the grid size, space-separated. Then, the program expects the initial position with the heading in the 3rd position. Any issue in the input of these 2 initial lines will prompt the user to retry the input.

Then the movements are taken as one string and processed one by one. Movements other than the predefined ones such as R, L or F will simply be ignored.

Finally, the program will output the report which is comprised of the final position followed by the final heading.

## Running the Program

A JAR archive has been exported for your convenience and can be run as follows, considering the Java Runtime (JRE) is installed:

```
java -jar Robot.jar
```

Depending on whether you are using a unix platform or Windows, you can run tests using one of the following commands:
1. Unix

```
./gradlew test
```
2. Windows

```
gradlew.bat test
```
