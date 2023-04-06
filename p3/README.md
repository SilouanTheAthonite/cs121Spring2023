# Project 3: TextBook

* Author: Bryce Younger
* Class: CS121 Section 3
* Semester: Spring 2023

## Overview

This program creates a primitive social-media platform known as TextBook. It allows for users to add posts, remove posts, comment on the posts of others, display a list of all posts, and select a post to read with its associated comments. When it first runs, the user will be asked to enter a username, and from there a menu is presented with the previously options for the platform.

## Reflection

I had an incredibly difficult time with this project largely because I was not able to utlize much of the time provided to work on it. For the first two weeks, I don't believe the slides and activities that were seen in class provided a substantial amount of understanding in order to implement this project's great undertaking. That, combined by both a chaotic schedule for this final week and my own personal negligance, I was not able to fully complete the project. My understanding of the use of PrintWriter, and the ability to append it, has been positively altered. The main technique I used to allow for less challenging debugging was my constant testing of the drivers, in order to see what constructors were functioning properly.

Concepts that remain unclear to me include how to implement the removal of Posts, and how to properly label the index number of the posts. My design process could have used far more organization, which would have been possible for me, if I had started earlier than I did in reality. If I were to go back in time and tell myself anything about this project, I would tell myself to consult the tutors and start before spring break began, since I ended up having far less free time than I initially thought.

## Compiling and Using

To compile, execute the following command in the main project directory:

javac TextBookDriver.java

Run the compiled class with the command:

java TextBookDriver

You will be prompted for your name, and after entering it you will be given the options of: (P)rint TextBook posts, (A)dd a new post, (D)elete a post, (C)omment on a post, (R)ead a post with comments, (Q)uit.

## Sources used

I consulted lectures slides for Module 5 and 6 in order to refresh my memory on how to use for-each loops, and how to implement PrintWriter.