# Assignment 6: Making a Game

Nicholas Nguyen

## Objectives

Using a game to explore ideas of inheritance, abstract classes,
dynamic dispatch, and final methods.

## Running the Code

To run the code, run `java Game`

To run the demo game, in the demoClasses directory, run `java -cp 
Game.jar Game`

## Design Decisions

We modified the Game to improve it from its original design.  Below, I
defend the design decisions.

### Making GamePiece Abstract

Making GamePiece abstract made sense because we're never instantiating it
and we need to make sure all children of GamePiece had a move method

### Calling an Abstract Method

We can call an abstract method because the objects inside the array all have
a move method and Java has dynamic dispatch where it automatically looks
to the children's methods if it does not see a method in the parent.

### Choices of Final Methods

I chose to make those methods final because they are methods that shouldn't
and don't need to be changed. Methods like getXPos and getYPos are fundamental
methods that don't need any modification.

### Adding a New Goblin

1) Create a new Java class with the name of the new goblin
2) When defining the Java class, make sure to inherit from 
   GamePiece.
3) Many of the functionalities are already implemented
   in the GamePiece class, so the primary goal is to implement
   a move method. So, implement your desired move method making sure
   to pass Game as a parameter. This is important to allow the goblin 
   to "see" the professor. 
4) Make sure to use the game.getHuman().getXPos();
   and game.getHuman().getYPos();. I forgot this and it was a nightmare