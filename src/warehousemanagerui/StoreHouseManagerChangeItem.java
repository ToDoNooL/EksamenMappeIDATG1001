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
        }
      } else {
        userInputForStoreHouse.next();
        printUserInterface.printValidNumberFrom0to8();
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
        setNewDiscount();
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
   * This method takes userInput as String and checks if it is valid then Returns it.

   * @return Returns a valid String.
   */
  private String waitValidString() {
    String itemNumber = "";
    boolean userValid = false;
    do {
      if (userInputForStoreHouse.hasNextLine()) {
        itemNumber = userInputForStoreHouse.nextLine();
        if (checkIfValid.checkIfValidString(itemNumber)) {
          userValid = true;
        }
      } else {
        printUserInterface.printValidItemNumber();
      }
    } while (!userValid);
    return itemNumber;
  }

  /**
   * This method takes userInput as int and checks if it is valid int then Returns it.

   * @return Returns a valid int, not lower than 0.
   */
  private int waitValidInt() {
    int newPrice = 0;
    boolean validInput = false;
    do {
      if (userInputForStoreHouse.hasNextInt()) {
        newPrice = userInputForStoreHouse.nextInt();
        if (checkIfValid.checkIfNumberIsNotLowerThanZero(newPrice)) {
          validInput = true;
        }
      } else {
        userInputForStoreHouse.next();
        printUserInterface.printValidPrice();
      }
    } while (!validInput);
    return newPrice;
  }

  /**
   * This method takes userInput as int and checks if it is valid discount then Returns it.

   * @return Returns a valid discount not higher than 100 and not lover or equal to 0.
   */
  private int waitValidDiscount() {
    boolean validInput = false;
    int newDiscount = 0;
    do {
      if (userInputForStoreHouse.hasNextInt()) {
        newDiscount = userInputForStoreHouse.nextInt();
        if (checkIfValid.checkIfValidDiscount(newDiscount)) {
          validInput = true;
        }
      } else {
        userInputForStoreHouse.next();
        printUserInterface.printValidItemNumber();
      }
    } while (!validInput);
    return newDiscount;
  }

  /**
   * This method is used to set a new price on an item in register.
   */
  private void setNewPriceOnItem() {
    printUserInterface.printEnterItemNumber();
    String itemNumber = waitValidString();
    printUserInterface.printSearchItem(itemNumber);
    printUserInterface.printEnterNewPrice();
    int newPrice = waitValidInt();
    itemRegister.setNewPriceOnItem(itemNumber, newPrice);
    printUserInterface.printSearchItem(itemNumber);
  }

  /**
   * This method is used to set a discount on an item in register.
   */
  private void setNewDiscount() {
    printUserInterface.printEnterItemNumber();
    String itemNumber = waitValidString();
    printUserInterface.printEnterNewDiscount();
    int newDiscount = waitValidDiscount();
    itemRegister.setDiscountOnItem(itemNumber, newDiscount);
    printUserInterface.printSearchItem(itemNumber);
  }

  /**
   * This method is used to set a new description on an item.
   */
  private void setNewDescription() {
    printUserInterface.printEnterItemNumber();
    String itemNumber = waitValidString();
    printUserInterface.printEnterNewDescription();
    String newDescription = waitValidString();
    itemRegister.setNewDescription(itemNumber, newDescription);
    printUserInterface.printSearchItem(itemNumber);
  }

  /**
   * This method is used to change the Item Description, price, and Discount.
   */
  private void changeDescriptionPriceAndDiscount() {
    printUserInterface.printEnterItemNumber();
    final String itemNumber = waitValidString();
    printUserInterface.printEnterNewDescription();
    String newDescription = waitValidString();
    printUserInterface.printEnterNewPrice();
    int newPrice = waitValidInt();
    printUserInterface.printEnterNewDiscount();
    int newDiscount = waitValidDiscount();
    itemRegister.setNewMethod(itemNumber, newDescription, newPrice, newDiscount);
    printUserInterface.printSearchItem(itemNumber);
  }
}
