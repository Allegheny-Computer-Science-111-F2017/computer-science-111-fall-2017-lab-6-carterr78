package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/** This program will display a sequence of genetic information and modify it
 *  in order to produce its complement and other modified versions of the
 *  original string. 
 *  
 *  <p>Bugs: This program has no known bugs. 
**/

public class ManipulateDna {

  /** This class will involve the modification of a strand of DNA in different
   *  ways. This will include calls to multiple different types of string
   *  manipulation. 
   *
  **/

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Gregory M. Kapfhammer " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("DNA strand to be processed: " + dna);
    System.out.println();
    
    // Step Two: Compute the complement of the DNA String
    String comp1 = dna.replace('a','T');
    String comp2 = comp1.replace('c','G');
    String comp3 = comp2.replace('g','C');
    String comp4 = comp3.replace('t','A');
    String compfinal = comp4.toLowerCase();
    System.out.println("The complement of this strand is: " + compfinal);

    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    String randpick = ("actg");
    Random rand = new Random();

    // Pick a random letter from the set of DNA acceptable characters
    int pick1 = rand.nextInt(randpick.length());
    char pick = randpick.charAt(pick1);

    // Add chosen random letter to DNA strand
    int pick2 = rand.nextInt(dna.length());
    String addlett = dna.substring(0, pick2) + pick + dna.substring(pick2);
    System.out.println("Inserting " + pick + " at position " + (pick2 + 1) 
        + " produces the string: " + addlett);

    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int pick3 = rand.nextInt(dna.length());
    char letter = dna.charAt(pick3);
    String takelett = dna.substring(0, pick3) + dna.substring(pick3 + 1);
    System.out.println("Removing the letter " + letter + " from position " 
        + (pick3 + 1) + " gives us the string: " + takelett);

    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int pick4 = rand.nextInt(randpick.length());
    int pick5 = rand.nextInt(dna.length());
    char letter2 = randpick.charAt(pick4);
    String switchlett1 = dna.substring(0, pick5) + dna.substring(pick5 + 1);
    String switchlett2 = switchlett1.substring(0, pick5) + letter2
        + switchlett1.substring(pick5);

    //print the modified string
    char letter3 = dna.charAt(pick5);
    System.out.println("Removing the letter " + letter3 + " from position " 
        + (pick5 + 1) + " and replacing it with the letter " + letter2 
        + " createsthe string: " + switchlett2);

    // Step Six: Display a final thankyou message
    System.out.println(); 
    System.out.println("Thank you for using the DNA Manipulator!");
    System.out.println("Have a wonderful day.");
  }

}
