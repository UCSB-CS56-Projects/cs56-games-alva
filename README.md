# cs56-games-alva

This games objective is to create a fun and interesting platformer where you move boxes, flip switches, and avoid obstacles.


* [javadoc on a-saied's site](http://a-saied.github.io/cs56-games-alva/javadoc/index.html)

* [javadoc on ucsb-cs56-projects](http://ucsb-cs56-projects.github.io/cs56-games-alva/javadoc/index.html)

## Features to add:
* Adding obstacles to test players reaction time and ability
* Add an ultimate objective to the game, a way to win. Think the flag pole in Mario.
* Create a background.
* Make new maps
* Add level editor GUI
* Add animations for different things the robot can do (pushing boxes, flipping switches)

## Things to refactor:
* The physics engine. It currently is slow and doesn't work that well. Look into AABX collision or another method that is more efficient.
* Animation on non-Linux machines. This game uses Linux graphics and runs unbearably slow on Windows and Mac. Find a way to run animation on these machines at the same rate as on Linux. 

## How to Run
To start the game, put "./gradlew run" into the command line (no quotations).
(Alternitively, put "ant run")

### Hit Space bar to use Flip Switches

![Alt Text](https://github.com/a-saied/cs56-games-alva/blob/master/assets/1z7lhq.gif)

### Hold F to grab and move Boxes

![Alt Text](https://github.com/a-saied/cs56-games-alva/blob/master/assets/1z7p2t.gif)

## How to Play
Objective: Get Alva from one end of the level to the other 
To play, simply use A and D to move left and right. W is to jump. SPACE is used to flip switches when nearby. Hold F to grab boxes and move them.

## F17 Final Remarks
* The code is very well factored out already. Try to stay with this standard when fixing any of the issues. Instead of adding to an existing class, try adding your own classes to handle new issues. 
* Make sure that you follow conventions already determined. Animations should be loaded in Animation.java, edits to building the world should be handled in World.java, etc. 
* Read all of the code before beginning. Make sure you understand what every file does before you change anything. Chances are it will make your issue fixes simpler if you understand how everything comes together. 

