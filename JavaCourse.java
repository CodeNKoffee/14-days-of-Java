import java.util.Scanner;

public class JavaCourse {
  public static void main(String[] args) {
    // LETS START PROGRAMMING

    /*
      Write a program to get the following output.
      Hey there,
      I am data!
    */ 
    System.out.println("Hey there, \nI'm data!");


    /* 
      Write a program to print

      (*
      **
      ***
      ****
      *****)

      on screen
    */
    System.out.println("*\n**\n***\n****\n*****");


    /* 
      Print the following pattern on the screen

      (*****
      ***
      *
      ***
      *****
      )
    */
    System.out.println("*****\n***\n*\n***\n*****");


    // Write a program to print the sum of the numbers 2, 4 and 5.
    System.out.println("The sum" + (2 + 4 + 5));


    // Write a program to get the difference and product of the numbers 45 and 32.
    System.out.println("The difference between 45 & 32 is " + (45 - 32));
    System.out.println("The product of 45 & 32 is " + (45 * 32));

    


    // DATA TYPES

    // Write a Java program to print an int, a double and a char on screen
    int x = 10;
    double y = 10.32;
    char z = 'H';

    System.out.println("int: " + x + "\ndouble: " + y + "\nchar: " + z);


    // Write a program to print the area of a rectangle of sides 2 and 3 units respectively
    int rectangleArea = 2 * 3;
    System.out.println("The area of the rectangle is " + rectangleArea + " units squared");


    // Write a program to print the product of the numbers 8.2 and 6.
    System.out.println(8.2 * 6);


    // Print the ASCII value of the character 'h'.
    System.out.println((int)'h');


    // Write a program to assign a value of 100.235 to a double variable and then convert it to int
    double q = 100.235;
    System.out.println((int)q);


    // Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character
    int asciiD = (int)'d';
    int newAscii = asciiD + 3;
    System.out.println((char)newAscii);

    /* OR */

    int currentAscii = 3 + 'd';
    System.out.println((char)currentAscii);


    // Write a program to add an integer variable having value 5 and double variable having value 6.2. 
    int valueOne = 5;
    double valueTwo = 6.2;
    System.out.println(valueOne + valueTwo);


    // Write a program to find the square of the number 3.9.
    System.out.println(3.9 * 3.9);


  // CSEN202 Tutorial 1 Exrecise
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the number of eggs:");
  int eggs = input.nextInt();

  int dozens = eggs / 12;
  int remainder = eggs % 12;

  /* Close the Scanner object to avoid resource leaks */
  input.close();
  System.out.println("You have " + dozens + " dozens and " + remainder + " eggs remaining.");
  }
}