package warehousemanagerui;

import itemstorage.ItemRegister;
import java.util.Scanner;
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
  private String searchUserInput = "";
  private int newAmount;

  public StoreHouseEditAmountOfItem(ItemRegister itemRegister) {
    this.itemRegister = itemRegister;
    this.printUserInterface = new PrintUserInterface(itemRegister);
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
    newAmount = scanner.nextInt();
    itemRegister.setNewHigherAmountInStorages(searchUserInput, newAmount);
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
    newAmount = scanner.nextInt();
    itemRegister.setNewLowerAmountInStorage(searchUserInput, newAmount);
    printUserInterface.printSearchItem(searchUserInput);
  }
}
