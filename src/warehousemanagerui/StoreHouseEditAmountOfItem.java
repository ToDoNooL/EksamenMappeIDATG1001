package warehousemanagerui;

import itemstorage.ItemRegister;
import java.util.Scanner;
import utilities.CheckIfValid;
import utilities.PrintUserInterface;

/**
 * The text based User Interface (UI) editAmount menu for the warehouse application.
 * Presents an editAmount to the user displaying the different available options.

 *  @author Eskil Alstad
 *
 *  @version 2022-12-08
 */
public class StoreHouseEditAmountOfItem {
  private final ItemRegister itemRegister;
  private final PrintUserInterface printUserInterface;
  private final CheckIfValid checkIfValid;
  private String searchUserInput = "";
  private int newAmount;

  /**
   * This method is used to call the itemRegister.

   * @param itemRegister uses the itemRegister Class.
   */
  public StoreHouseEditAmountOfItem(ItemRegister itemRegister) {
    this.itemRegister = itemRegister;
    this.printUserInterface = new PrintUserInterface(itemRegister);
    this.checkIfValid = new CheckIfValid();
  }

  /**
   * This method is used to Increase the amount of an item from userInput int.
   */
  public void increaseItemAmount() {
    Scanner scanner = new Scanner(System.in);
    printUserInterface.printEnterItemNumber();
    searchUserInput = scanner.nextLine();
    printUserInterface.printSearchItem(searchUserInput);
    printUserInterface.printEnterNewAmountItem();
    boolean userInputValid = false;
    do {
      if (scanner.hasNextInt()) {
        newAmount = scanner.nextInt();
        if (checkIfValid.checkIfNumberIsNotLowerThanZero(newAmount)) {
          itemRegister.setNewHigherAmountInStorages(searchUserInput, newAmount);
          userInputValid = true;
        }
      } else {
        scanner.nextLine();
        printUserInterface.printValidAmount();
      }
    } while (!userInputValid);

    printUserInterface.printSearchItem(searchUserInput);
  }

  /**
   * This method is used to decrease the amount of a from userInput int.
   */
  public void decreaseItemAmount() {
    Scanner scanner = new Scanner(System.in);
    printUserInterface.printEnterItemNumber();
    searchUserInput = scanner.nextLine();
    printUserInterface.printSearchItem(searchUserInput);
    printUserInterface.printEnterSmallerAmountItem();
    boolean userInputValid = false;
    do {
      if (scanner.hasNextInt()) {
        newAmount = scanner.nextInt();
        if (checkIfValid.checkIfNumberIsNotLowerThanZero(newAmount)) {
          itemRegister.setNewLowerAmountInStorage(searchUserInput, newAmount);
          userInputValid = true;
        }
      } else {
        scanner.nextLine();
        printUserInterface.printValidAmount();
      }
    } while (!userInputValid);
    printUserInterface.printSearchItem(searchUserInput);
  }
}
