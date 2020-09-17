import java.util.Scanner;

/**
 *Calculate the amount of computer parts
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner to use input
    Scanner input = new Scanner(System.in);
    
    // Asks the user the amount of chargers
    System.out.println("Amount of Chromebook chargers?");

    // Displays the final constant for charger price
    final double CHARGER_PRICE = 34.99;

    // Allows user to print numbers on the screen
    int chargers = input.nextInt();

    // Calculates the price for the chargers
    double chargerPrice = CHARGER_PRICE * chargers;

    //Asks the user the amount of motherboards
    System.out.println("Amount of motherboards");

    // Displays the final constant for motherboard price
    final double MOTHERBOARD_PRICE = 127.5;

    //Allows user to print number on the screen
    int motherboards = input.nextInt();

    // Calculates the price for the motherboards
    double motherboardPrice = MOTHERBOARD_PRICE * motherboards;

    //Asks the user the amount of mice
    System.out.println("Amount of Mice");

    //Displays the final constant for motherboard price
    final double MOUSE_COST = 18.0;

    //Allows user to print number on the screen
    int mouse = input.nextInt();

    // Displays the final constant for mouse price
    double mousePrice = MOUSE_COST * mouse;

    //Calculates the price for the mice
    double subtotal = motherboardPrice + mousePrice + chargerPrice;

    //Calculates the subtotal of the taxes
    double taxes = subtotal * 1.13;

    // Displays the final constant for the subtotal of the taxes
    double total = subtotal + taxes;

    //Displays the subtotal of the money to the screen
    System.out.println("Subtotal = $" + subtotal);

    //Displays the total cost to the screen
    System.out.println("Total Cost with tax = $" + taxes);


  }
}
