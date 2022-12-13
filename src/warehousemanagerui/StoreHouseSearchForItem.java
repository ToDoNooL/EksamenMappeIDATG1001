package warehousemanagerui;

import itemstorage.ItemRegister;
import java.util.Scanner;
import utilities.CheckIfValid;
import utilities.PrintUserInterface;

/**
 * The text based User Interface (UI)  SearchForItem for the warehouse application.
 * Presents an SearchForItem to the user displaying the different available options.

 *  @author Eskil Alstad
 *
 *  @version 2022-12-08
 */
public class StoreHouseSearchForItem {
  private final ItemRegister itemRegister;
  private final PrintUserInterface printUserInterface;
  private final CheckIfValid checkIfValid = new CheckIfValid();
  private final Scanner userInput = new Scanner(System.in);

  public StoreHouseSearchForItem(ItemRegister itemRegister) {
    this.itemRegister = itemRegister;
    this.printUserInterface = new PrintUserInterface(itemRegister);
  }

  /**
   * This Method is used to search For Item from itemNumber String.

   * @param searchInput takes userInput String.
   */
  public void itemSearch(String searchInput) {
    printUserInterface.printEnterItemNumber();
    boolean userInputValid = false;
    do {
      if (userInput.hasNextLine()) {
        searchInput = userInput.nextLine();
        if (checkIfValid.checkIfValidString(searchInput)) {
          userInputValid = true;
        }
      } else {
        userInput.nextLine();
        printUserInterface.printValidItemNumber();
      }
    } while (!userInputValid);
    itemRegister.foundItemsByItemNumber(searchInput);
    printUserInterface.printSearchItem(searchInput);
  }
}