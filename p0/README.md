# Project 0: Traffic Animation

* Author: Bryce Younger
* Class: CS121 Section 3
* Semester: Spring 2023

## Overview

This java program creates an animation of a 2008 maroon chevy impala driving across the window on a road. Also featured are a night sky, complete with a full moon, desert scenery, and a bystander with a matching maroon shirt.


## Reflection

This was a very fun project which proved to be rarely challenging throughout the course of its completion. The one portion of the project which proved to be challenging was creating arcs at the proper starting x and/or y coordinate on screen. Save for that small issue, the remainder of the project, in particular the drawing of the car, was merely time consuming. The project required a lot of testing are experimentation, which revealed to me why the class is known as "Computer Science."

I experimented with the fillPolygon command, and it ended up being easier to implement than it first seemed. I am currently not aware if there is any other way to create circles, other than using the fillOval command. If there isn't, it isn't clear to me how to maintain the equality of width and height with a changing window size. I frequently ran my animation in order to avoid a long search for difficult to find bugs. As of right this moment, I don't see any issues with my design process as a whole that warrent changing. If I could go back in time, I would start the project earlier in order get more sleep to start my week off strong.

## Compiling and Using

To compile, execute the following command in the main project directory:

javac TrafficAnimation.java


Run the compiled class with the command:

java TrafficAnimation

