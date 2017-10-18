# Reflection by Ross Carter

This lab required me to write a file called ManipulateDNA. The purpose of this
program was to take input from a string containing the characters a, c, t, and g
and manipulate it in a few different ways. This first involved printing out the
complement to the inputted DNA string. It seems there were a number of ways to
do this, but I used Java's case sensitivity to ensure that letters would not be
switched back to their original form accidentally, and used a toLowerCase
string manipulation to restore the string's format.

The next task was to insert a random DNA letter at a random position in the DNA
strand provided. I was initially puzzled by this step because it involved some
more complicated applications of the random class than we had previously worked
with, but once I got the basic idea down the rest was simple. I created integer
variables in order to determine the random position at which to place the new
letter, and to determine which position in a list of acceptable DNA letters to
draw the additional character from. Selecting this additional character also
required me to create a char variable, which involved using the
charAt(position) command to draw out the character from the chosen location in
the list of accepted letters. After all this, I had to construct the
manipulated string. This was done using multiple substrings with a break at the
position to be adjusted. In this break, the chosen character was added.

I used the same basic process to conduct the rest of the string manipulations
required. The bulk of the difficulty of this lab, however, stemmed
from the general complexity and tediousness of the individual commands required
to produce the desired output. It was often confusing working out which
random letters should have been chosen from which positions on which string,
and how this related to the actual output produced, but this did no more than
slow me down a bit, as I was able to experiment with and make many small
adjustments to the program to get to an accurate finished product.
