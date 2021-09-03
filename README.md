# parse-user-input-name
My Solution for Chapter 2 Exercise 6 of Introduction to Programming Using Java"

This exercise asks you to write a program that tests some of the built-in subroutines for
working with Strings. The program should ask the user to enter their first name and their
last name, separated by a space. Read the user’s response using textio.TextIO.getln(). Break
the input string up into two strings, one containing the first name and one containing the
last name. You can do that by using the indexOf() subroutine to find the position of the
space, and then using substring() to extract each of the two names. Also output the
number of characters in each name, and output the user’s initials. (The initials are the
first letter of the first name together with the first letter of the last name.) A sample run
of the program should look something like this:
       Please enter your first name and last name, separated by a space.
       ? Mary Smith
       Your first name is Mary, which has 4 characters
       Your last name is Smith, which has 5 characters
       Your initials are MS
       
Notes:
TextIO is an IO helper class created by the textbook's author
to assist with IO before the book covers java's IO utilities.

