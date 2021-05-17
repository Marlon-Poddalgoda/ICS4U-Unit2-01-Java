import java.util.ArrayList;
/**
 * This program adds number to an array using OOP.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-17
 */

public class MrCoxallStack {
    // Class for MrCoxallStack

    // properties
    /**
    * This is the Arraylist.
    */
    private ArrayList<Integer> stackAsList = new ArrayList<Integer>();

    // methods
    /**
    * This method pushes user input into the list.
    * @param userInput This is the user input.
    */
    public void push(final int userInput) {
        // adds user input to list
        stackAsList.add(userInput);
    }

    /**
    * This method prints the list out.
    */
    public void showStack() {
        // prints list to console
        for (int number : stackAsList) {
            // loop to print each value
            System.out.print(number + ", ");
        }
        System.out.println();
    }
}
