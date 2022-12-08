package warehousemanagerui;

import itemstorage.ItemRegister;
import java.util.Scanner;
import utilities.CheckIfValid;
import utilities.PrintUserInterface;

/**
 * The text based User Interface (UI) Exit menu for the warehouse application.
 * Presents an Exit to the user displaying the different available options.

 *  @author Eskil Alstad
 *
 *  @version 2022-12-08
 */
public class StoreHouseExit {
  private final PrintUserInterface printUserInterface;
  private final CheckIfValid checkIfValid;
  private int userInput = 0;


  /**
   * This Constructor is used for exit UI for the user.
   */
  public StoreHouseExit() {
    this.printUserInterface = new PrintUserInterface(new ItemRegister());
    this.checkIfValid = new CheckIfValid();
    printUserInterface.printExit();
    exitMessage();
  }

  /**
   * This method is printing the exit and takes the user input to decide if it wants to exit
   * the application.
   */
  public void exitMessage() {
    Scanner scannerExit = new Scanner(System.in);
    boolean validUserInput = false;
    do {
      if (scannerExit.hasNextInt()) {
        userInput = scannerExit.nextInt();
        if (checkIfValid.checkValidIntYesOrNo(userInput)) {
          validUserInput = true;
        } else if (!checkIfValid.checkValidIntYesOrNo(userInput)) {
          scannerExit.nextLine();
          printUserInterface.printValidNumberFrom0to1();
        }
      } else {
        scannerExit.next();
        printUserInterface.printValidNumberFrom0to1();
      }
    } while (!validUserInput);
  }

  /**
   * This method gets the userInput.

   * @return Returns the userInput int.
   */
  public int getUserInput() {
    return userInput;
  }
}
