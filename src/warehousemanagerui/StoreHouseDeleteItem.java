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
public class StoreHouseDeleteItem {
  private final ItemRegister itemRegister;
  private final PrintUserInterface printUserInterface;
  private int userInput = 0;
  private final Scanner userInputDelete = new Scanner(System.in);
  private final CheckIfValid checkIfValid = new CheckIfValid();

  public StoreHouseDeleteItem(ItemRegister itemRegister) {
    this.itemRegister = itemRegister;
    this.printUserInterface = new PrintUserInterface(itemRegister);
  }

  /**
   * This method prints the Exit menu for the UI.

   * @param searchUserInput is the input for user as int.
   */
  public String deleteItemString(String searchUserInput) {
    boolean userInputValid = false;
    printUserInterface.printHowToDeleteItem();
    do {
      if (userInputDelete.hasNextLine()) {
        searchUserInput = userInputDelete.nextLine();
        if (checkIfValid.checkIfValidString(searchUserInput)) {
          userInputValid = true;
        }
      } else {
        userInputDelete.nextLine();
        userInputDelete.next();
      }
    } while (!userInputValid);
    return searchUserInput;
  }

  /**
   * This method prints to delete item menu.

   * @param searchUserInput return the itemNumber as String.
   */
  public void deleteItem(String searchUserInput) {
    itemRegister.foundItemsByItemNumber(searchUserInput);
    printUserInterface.printSearchItem(searchUserInput);
    printUserInterface.printConfirmMenuDelete();
    boolean userInputValidV2 = false;
    do {
      if (userInputDelete.hasNextInt()) {
        userInput = userInputDelete.nextInt();
        if (checkIfValid.checkValidIntYesOrNo(userInput)) {
          userInputValidV2 = true;
        }
      } else {
        userInputDelete.nextLine();
        userInputDelete.next();
      }
    } while (!userInputValidV2);
    if (userInput == 1) {
      if (this.itemRegister.deleteItemFromStorage(searchUserInput)) {
        printUserInterface.printItemDeleted();
      } else {
        printUserInterface.printItemNotFound();
      }
    }
  }
}
