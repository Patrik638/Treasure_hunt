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
This application is developed as education for test driven development. It is written in Java and the user interface is Swing.
The user interface presents a playing field created by a 2-dimensional Integer array. Value 2 on the playing field is the player itself. The player moves on the playing field through the keys A = left, D = right, W = Up and S = Down. Player must collect treasures (value 3 on the playing field) while the player must watch out for lasers (value 5 on the playing field). When all treasures are found the door opens (value 4 on the playing field). You have 60 seconds to find all the treasures and exit thru the door, otherwise it will be Gameover. It will also be Gameover if the player is hit by a laser.

## Examples of JUnit tests
* testSetValueOfPositionMethod (test to verify that method to change value on gameboard works).
* playerMoveLeftDirection_intoWall (test to verify that player can not move thru wall our outside the frame).
* jTextAreaShowText() (test to verify that GUI working correct).
* IsitTimecurenttime() (test to verfiy Time is actual time now ).
* IsItTImerGiveRightPassedTime() (Test to verify timer is working proper and give actual time had been passed).
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
