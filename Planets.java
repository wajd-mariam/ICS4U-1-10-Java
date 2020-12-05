/*
* Copyright (c) 2020
*
* This program determines the average mark of 
* students in class.
*
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/03
*/


// Imports Java Classes:
import java.util.Scanner;

public class Planets {
  /**
   * This function calculates the average of numbers 
   * in the given array.
   */
  enum PlanetsEnum {
    // List of all planets:
    Mercury(1), Venus(2), Earth(3), Mars(4), Jupiter(5),
    Saturn(6), Uranus(7), Neptune(8);
    
    // Returning values.
    int index;
    PlanetsEnum(int enumIndex) {
      this.index = enumIndex;
    }

    public int displayPlanet() {
      return index;
    }
  }
  
  /**
  * This function generates random numbers and appends them
  * in an array.
  */
  public static void main(String[] args) {
    // Try Catch statement:
    try {
      
      // Input
      Scanner input1 = new Scanner(System.in);
      System.out.print("Enter the name or position of a planet: ");
      String userInput = input1.nextLine();

      
      // Process
      PlanetsEnum planetName = PlanetsEnum.valueOf(userInput);
      int positionPlanet = planetName.displayPlanet();
      
      // Output
      System.out.println("");
      System.out.println(userInput + " is number " + positionPlanet
                         + " in the solar system");
    
    // Catching any actual errors.
    } catch (Exception e) {
      System.out.println("Invalid input!");
    }
  }
}  