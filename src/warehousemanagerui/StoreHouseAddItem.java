package warehousemanagerui;

import itemstorage.Item;
import itemstorage.ItemBuilder;
import itemstorage.ItemRegister;
import java.util.Locale;
import java.util.Scanner;
import utilities.CheckIfValid;
import utilities.PrintUserInterface;

/**
 * The text based User Interface (UI) Start Menu for the warehouse application.
 * Presents a menu to the user displaying the different available options.

 *  @author Eskil Alstad
 *
 *  @version 2022-12-08
 */
public class StoreHouseAddItem {
  private final PrintUserInterface printUserInterface;
  private final CheckIfValid checkIfValid;

  //Main register holding all the items
  // Set to final, since it will no change after having been
  // set in the constructor
  private final ItemRegister itemRegister;
  private int userInput = 0;
  private String tempValueString;
  private int tempValueInt;
  private float tempValueFloat;
  private int tempValueIntCategory;
  private final Scanner scannerForAddItem = new Scanner(System.in).useLocale(Locale.GERMAN);

  /**
   * Creates an instance of itemRegister, printUserInterface, CheckValid.

   * @param itemRegister takes itemRegister.
   */
  public StoreHouseAddItem(ItemRegister itemRegister) {
    this.itemRegister = itemRegister;
    this.printUserInterface = new PrintUserInterface(itemRegister);
    this.checkIfValid = new CheckIfValid();
  }

  /**
   * This method is used to get userInput for String in the UI.

   * @param infoText prints the info to the user.
   * @param errorMessage prints the error messages if the user types wrong.
   * @return Returns the value the user gave String.
   */
  private String waitForValidString(int infoText, int errorMessage) {
    switch (infoText) {
      case 1 -> printUserInterface.printEnterDescription();
      case 2 -> printUserInterface.printEnterColour();
      case 3 -> printUserInterface.printEnterBrand();
      case 4 -> printUserInterface.printEnterItemNumber();
      case 5 -> printUserInterface.printEnterNewDescription();
      case 6 -> printUserInterface.printEnterNewColour();
      case 7 -> printUserInterface.printEnterNewBrand();
      case 8 -> printUserInterface.printEnterNewItemNumber();
      default -> waitForValidString(0, 0);
    }
    boolean validDescription = false;
    do {
      if (scannerForAddItem.hasNextLine()) {
        String temp = scannerForAddItem.nextLine();
        if (checkIfValid.checkIfValidString(temp)) {
          tempValueString = temp;
          validDescription = true;
        }
      } else {
        switch (errorMessage) {
          case 1 -> printUserInterface.printValidDescription();
          case 2 -> printUserInterface.printValidColour();
          case 3 -> printUserInterface.printValidBrand();
          case 4 -> printUserInterface.printValidItemNumber();
          default -> waitForValidString(0, 0);
        }
      }
    } while (!validDescription);
    return tempValueString;
  }

  /**
   * This method is used to get userInput for int in the UI.

   * @param infoText prints the info to the user.
   * @param errorMessage prints the error messages if the user types wrong.
   * @return Returns the value the user gave int.
   */
  private int waitForValidInt(int infoText, int errorMessage) {
    switch (infoText) {
      case 1 -> printUserInterface.printEnterPrice();
      case 2 -> printUserInterface.printEnterNewPrice();
      case 3 -> printUserInterface.printEnterAmountOfItem();
      default -> waitForValidInt(0, 0);
    }
    boolean validPrice = false;
    do {
      if (scannerForAddItem.hasNextInt()) {
        int temp = scannerForAddItem.nextInt();
        if (checkIfValid.checkIfNumberIsNotLowerThanZero(temp)) {
          tempValueInt = temp;
          validPrice = true;
        }
      } else {
        scannerForAddItem.next();
        switch (errorMessage) {
          case 1 -> printUserInterface.printValidPrice();
          case 2 -> printUserInterface.printValidAmount();
          default -> waitForValidInt(0, 0);
        }
      }
    } while (!validPrice);
    return tempValueInt;
  }

  /**
   * This method is used to get userInput for int in the UI.

   * @return Returns the int for the category uses Enum to get a String
   */
  private int waitForValidCategory() {
    printUserInterface.printEnterForItemCategory();
    boolean validPrice = false;
    do {
      if (scannerForAddItem.hasNextInt()) {
        int temp = scannerForAddItem.nextInt();
        if (checkIfValid.checkValidIntCategory(temp)) {
          tempValueIntCategory = temp;
          validPrice = true;
        }
      } else {
        scannerForAddItem.next();
      }
    } while (!validPrice);
    return tempValueIntCategory;
  }

  /**
   * This method is used to get userInput for float in the UI.

   * @param infoText prints the info to the user.
   * @param errorMessage prints the error messages if the user types wrong.
   * @return Returns the value the user gave float.
   */
  private float waitForValidFloat(int infoText, int errorMessage) {
    switch (infoText) {
      case 1 -> printUserInterface.printEnterWeight();
      case 2 -> printUserInterface.printEnterLenght();
      case 3 -> printUserInterface.printEnterHeight();
      case 4 -> printUserInterface.printEnterNewWeight();
      case 5 -> printUserInterface.printEnterNewLenght();
      case 6 -> printUserInterface.printEnterNewHeight();
      default -> waitForValidFloat(0, 0);
    }
    boolean validWeight = false;
    do {
      if (scannerForAddItem.hasNextFloat()) {
        float temp = scannerForAddItem.nextFloat();
        if (checkIfValid.checkIfValidFloat(temp)) {
          tempValueFloat = temp;
          validWeight = true;
        }
      } else {
        scannerForAddItem.next();
        switch (errorMessage) {
          case 1 -> printUserInterface.printValidWeight();
          case 2 -> printUserInterface.printValidLenght();
          case 3 -> printUserInterface.printValidHeight();
          default -> waitForValidFloat(0, 0);
        }
      }
    } while (!validWeight);
    return tempValueFloat;
  }

  /**
   * This Method is used to get to the add menuUI.
   */
  public void addItemMenu() {
    printUserInterface.printAddItemMenu();
    boolean userInputValid = false;
    do {
      if (scannerForAddItem.hasNextInt()) {
        userInput = scannerForAddItem.nextInt();
        if (checkIfValid.checkValidIntAddItem(userInput)) {
          userInputValid = true;
        }
      } else {
        scannerForAddItem.nextLine();
        printUserInterface.printValidNumberFrom0to2();
        scannerForAddItem.next();
      }
    } while (!userInputValid);
    switch (userInput) {
      case 1 -> addItem();
      case 2 -> {
        StoreHouseMenuUi storeHouseMenuUi = new StoreHouseMenuUi();
        storeHouseMenuUi.start();
      }
      default -> addItemMenu();
    }
  }

  private void addItem() {

    String itemDescription; //A small Description of the item
    itemDescription = waitForValidString(1, 1);

    int itemPrice; //the price of the item
    itemPrice = waitForValidInt(1, 1);

    String colourOfItem; //The colour of the item
    colourOfItem = waitForValidString(2, 2);

    float itemWeight; //The weight of the item in KG
    itemWeight = waitForValidFloat(1, 1);

    String itemBrandName; //Brand name of the item
    itemBrandName = waitForValidString(3, 3);

    float itemLenght; //Length Of the Item
    itemLenght = waitForValidFloat(2, 2);

    float itemHeight; // The Height Of the Item
    itemHeight = waitForValidFloat(3, 3);

    String itemNumber; //AKA. ItemName
    itemNumber = waitForValidString(4, 4);

    int itemAmount; //The Amount Of items In Storage
    itemAmount = waitForValidInt(3, 2);

    int itemCategory; //The Category of the item, Enum
    itemCategory = waitForValidCategory();




    Item item =
        new ItemBuilder().setColourOfItem(colourOfItem).setItemNumber(itemNumber)
          .setItemPrice(itemPrice).setItemBrandName(itemBrandName).setItemLenght(itemLenght)
          .setItemHeight(itemHeight).setItemWeight(itemWeight)
          .setItemDescription(itemDescription).setNumberOfItemsInStorage(itemAmount)
          .setCategoriesOfItems(itemCategory).getItem();
    itemRegister.addItem(item);
  }

  /**
   * This method Prints the confirm menu ui.
   */
  public void confirmItem() {
    boolean userInputValid = false;
    printUserInterface.printConfirmMenuForItem();
    do {
      if (scannerForAddItem.hasNextInt()) {
        userInput = scannerForAddItem.nextInt();
        if (checkIfValid.checkIfValidAddToList(userInput)) {
          userInputValid = true;
        } else if (!checkIfValid.checkIfValidAddToList(userInput)) {
          scannerForAddItem.nextLine();
          printUserInterface.printValidNumberFrom0to2();
        }
      } else {
        scannerForAddItem.next();
        printUserInterface.printValidNumberFrom0to2();
      }
    } while (!userInputValid);

    switch (userInput) {
      case 1:
        printNewItem();
        break;
      case 2:
        break;
      case 0:
        addItemMenu();
        break;
      default:
    }
  }

  /**
   * This method prints the new item confirmation to the ui.
   */
  public void printNewItem() {
    boolean userInputValid = false;
    printUserInterface.printConfirmItemMenu();
    do {
      if (scannerForAddItem.hasNextInt()) {
        userInput = scannerForAddItem.nextInt();
        if (checkIfValid.checkValidIntYesOrNo(userInput)) {
          userInputValid = true;
        } else if (!checkIfValid.checkValidIntYesOrNo(userInput)) {
          scannerForAddItem.nextLine();
          printUserInterface.printValidNumberFrom0to1();
        }
      } else {
        scannerForAddItem.next();
        printUserInterface.printValidNumberFrom0to1();
      }
    } while (!userInputValid);
    switch (userInput) {
      case 1:
        break;
      case 0:
        confirmItem();
        break;
      default:
    }

  }
}
