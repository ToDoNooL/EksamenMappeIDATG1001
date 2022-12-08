package warehousemanagerui;

import itemstorage.ItemRegister;
import java.util.Scanner;
import utilities.CheckIfValid;
import utilities.PrintUserInterface;

/**
 * The text based User Interface (UI) changeItem menu for the warehouse application.
 * Presents an changeItem to the user displaying the different available options.

 *  @author Eskil Alstad
 *
 *  @version 2022-12-08
 */
public class StoreHouseManagerChangeItem {
  public final ItemRegister itemRegister;
  public final PrintUserInterface printUserInterface;
  public final CheckIfValid checkIfValid;
  private String searchUserInput = "";
  private int newPrice;
  private int newDiscount;
  private String newDescription;
  private final Scanner userInputForStoreHouse = new Scanner(System.in);

  /**
   * This method is the constructors and calls for the itemRegister to use.

   * @param itemRegister calls itemRegister.
   */
  public StoreHouseManagerChangeItem(ItemRegister itemRegister) {
    this.itemRegister = itemRegister;
    this.printUserInterface = new PrintUserInterface(itemRegister);
    this.checkIfValid = new CheckIfValid();
  }

  /**
   * Prints the menu for chose of change item.
   */
  public void storeHouseManagerChangeItemMethod() {
    int userInput = 0;
    printUserInterface.printChangeItemMenu();
    boolean validUserInput = false;
    do {
      if (userInputForStoreHouse.hasNextInt()) {
        userInput = userInputForStoreHouse.nextInt();
        if (checkIfValid.checkValidIntIntMenu(userInput)) {
          validUserInput = true;
        } else {
          userInputForStoreHouse.next();
          printUserInterface.printValidNumberFrom0to8();
        }
      }
    } while (!validUserInput);
    switch (userInput) {
      case 1:
        setNewDescription();
        break;
      case 2:
        setNewPriceOnItem();
        break;
      case 3:
        setDiscountOnItem();
        break;
      case 4:
        changeDescriptionPriceAndDiscount();
        break;
      case 0:
        break;
      default:
        storeHouseManagerChangeItemMethod();
    }
  }

  /**
   * This method is used to set a new price on an item in register.
   */
  public void setNewPriceOnItem() {
    Scanner scanner = new Scanner(System.in);
    printUserInterface.printEnterItemNumber();
    searchUserInput = scanner.nextLine();
    printUserInterface.printSearchItem(searchUserInput);
    printUserInterface.printEnterNewPrice();
    newPrice = scanner.nextInt();
    itemRegister.setNewPriceOnItem(searchUserInput, newPrice);
    printUserInterface.printSearchItem(searchUserInput);
  }

  /**
   * This method is used to set a discount on an item in register.
   */
  public void setDiscountOnItem() {
    Scanner scanner = new Scanner(System.in);
    printUserInterface.printEnterItemNumber();
    searchUserInput = scanner.nextLine();
    printUserInterface.printSearchItem(searchUserInput);
    printUserInterface.printEnterNewDiscount();
    newDiscount = scanner.nextInt();
    itemRegister.setDiscountOnItem(searchUserInput, newDiscount);
    printUserInterface.printSearchItem(searchUserInput);
  }

  /**
   * This method is used to set a new description on an item.
   */
  public void setNewDescription() {
    Scanner scanner = new Scanner(System.in);
    printUserInterface.printEnterItemNumber();
    searchUserInput = scanner.nextLine();
    printUserInterface.printSearchItem(searchUserInput);
    printUserInterface.printEnterNewDiscount();
    newDescription = scanner.nextLine();
    itemRegister.setNewDescription(searchUserInput, newDescription);
    printUserInterface.printSearchItem(searchUserInput);
  }

  /**
   * This method is used to change the Item Description, price, and Discount.
   */
  public void changeDescriptionPriceAndDiscount() {
    Scanner scanner = new Scanner(System.in);
    printUserInterface.printEnterItemNumber();
    searchUserInput = scanner.nextLine();
    printUserInterface.printSearchItem(searchUserInput);
    printUserInterface.printEnterNewDescription();
    newDescription = scanner.nextLine().trim();
    printUserInterface.printEnterNewPrice();
    newPrice = scanner.nextInt();
    printUserInterface.printEnterNewDiscount();
    newDiscount = scanner.nextInt();
    itemRegister.setNewMethod(searchUserInput, newDescription, newPrice, newDiscount);
    printUserInterface.printSearchItem(searchUserInput);
  }
}
