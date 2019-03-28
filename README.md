# Treasure_hunt
This application is a game that involves collecting treasures during an certain period of time, this while there are lasers that are activated after a certain time schedule.

## Table of contents
* [Team members](#team-members)
* [General info](#general-info)
* [Examples of JUnit tests](#examples-of-JUnit-tests)
* [Setup](#setup)
* [License](#license)

## Team members
* Nicklas Carlsson
* Hamed Adeli
* Mohamad Daoud
* Patrik Karlsson

## General info
This is a group project that is created as education for test driven development. It is written in Java and the user interface is Swing

## Examples of JUnit tests
* testSetValueOfPositionMethod (test to verify that method to change value on gameboard works).
* playerMoveLeftDirection_intoWall (test to verify that player can not move thru wall our outside the frame).
* 
* 
* 

## Setup
To have the JUnit tests running you need to add junit*.jar to your IDE Ex. junit-4.6.jar or if it is a Maven project add a dependencie to the pom.xml file.

```
$   <dependencies>
$		<dependency>
$			<groupId>junit</groupId>
$			<artifactId>junit</artifactId>
$			<version>4.12</version>
$			<scope>test</scope>
$		</dependency>
$	</dependencies>
```

## License
Licensed under the GNU General Public License v2.0