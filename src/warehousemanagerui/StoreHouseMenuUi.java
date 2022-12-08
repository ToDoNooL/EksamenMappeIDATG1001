package warehousemanagerui;

import itemstorage.ItemBuilder;
import itemstorage.ItemRegister;
import java.util.Scanner;
import utilities.CheckIfValid;
import utilities.PrintUserInterface;

/**
 * The text based User Interface (UI)  MainMenu for the warehouse application.
 * Presents an MainMenu to the user displaying the different available options.

 *  @author Eskil Alstad
 *
 *  @version 2022-12-08
 */
public class StoreHouseMenuUi {
  private final ItemRegister itemRegister;
  private final PrintUserInterface printUserInterface;
  private final CheckIfValid checkIfValid;
  private int userInput = 0;

  /**
   * This method is used to creat the itemRegister and fills the register with items.
   */
  public StoreHouseMenuUi() {
    this.itemRegister = new ItemRegister();
    this.printUserInterface = new PrintUserInterface(itemRegister);
    this.checkIfValid = new CheckIfValid();
    fillItemRegisterWithCars();
  }

  /**
   * This starts the application.
   */
  public void start() {
    storeHouseMainMenu();
  }

  /**
   * This method is the Main-menu for the application.
   */
  private void storeHouseMainMenu() {
    boolean running = true;
    do {
      printUserInterface.printMainMenu();
      Scanner userInputForStoreHouse = new Scanner(System.in);
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
        case 0 -> {
          StoreHouseExit storeHouseExit = new StoreHouseExit();
          int userExit = storeHouseExit.getUserInput();
          if (userExit == 1) {
            printUserInterface.printLeavingMessage();
            running = false;
          } else {
            printUserInterface.printReturningMessage();
            storeHouseMainMenu();
          }
        }
        case 1 -> {
          printUserInterface.printNumberOfItemsInStorage();
          printUserInterface.printAllItems();
        }
        case 2 -> {
          StoreHouseSearchForItem storeHouseSearchForItem =
              new StoreHouseSearchForItem(itemRegister);
          storeHouseSearchForItem.itemSearch("");
        }
        case 3 -> {
          StoreHouseAddItem storeHouseAddItem =
              new StoreHouseAddItem(itemRegister);
          storeHouseAddItem.addItemMenu();
        }
        case 4 -> {
          StoreHouseEditAmountOfItem storeHouseEditAmountOfItem =
              new StoreHouseEditAmountOfItem(itemRegister);
          storeHouseEditAmountOfItem.increaseItemAmount();
        }
        case 5 -> {
          StoreHouseEditAmountOfItem storeHouseEditAmountOfItem1 =
              new StoreHouseEditAmountOfItem(itemRegister);
          storeHouseEditAmountOfItem1.decreaseItemAmount();
        }
        case 6 -> {
          StoreHouseDeleteItem storeHouseDeleteItem =
              new StoreHouseDeleteItem(itemRegister);
          String temp = storeHouseDeleteItem.deleteItemString("");
          storeHouseDeleteItem.deleteItem(temp);
        }
        case 7 -> {
          StoreHouseManagerChangeItem storeHouseManagerChangeItem =
              new StoreHouseManagerChangeItem(itemRegister);
          storeHouseManagerChangeItem.storeHouseManagerChangeItemMethod();
        }
        case 8 -> printUserInterface.printAllItemsWithAllDetails();
        default -> storeHouseMainMenu();
      }
    } while (running);
  }

  /**
   * This method fills the register with items.
   */
  private void fillItemRegisterWithCars() {
    String brand = "NorwegianFlorAS";
    String colour = "Brown";
    String brand1 = "BoxMan";

    this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Yellow")
            .setItemDescription("Big Box").setItemHeight(75).setItemLenght(100)
            .setItemPrice(100).setItemBrandName("WoodCooper").setItemNumber("ABC")
            .setNumberOfItemsInStorage(10).setCategoriesOfItems(2).getItem());

    this.itemRegister.addItem(new ItemBuilder().setColourOfItem(colour)
             .setItemDescription("Small Box").setItemHeight(60).setItemLenght(70)
             .setItemPrice(250).setItemBrandName(brand1).setItemNumber("ABC1")
             .setNumberOfItemsInStorage(100).setCategoriesOfItems(4).getItem());

    this.itemRegister.addItem(new ItemBuilder().setColourOfItem(colour)
             .setItemDescription("Small Box").setItemHeight(60).setItemLenght(70)
             .setItemPrice(200).setItemBrandName(brand1).setItemNumber("ABC2")
             .setNumberOfItemsInStorage(50).setCategoriesOfItems(3).getItem());

    this.itemRegister.addItem(new ItemBuilder().setColourOfItem(colour)
             .setItemDescription("A box we don't know").setItemHeight(100).setItemLenght(100)
             .setItemPrice(500).setItemBrandName(brand1).setItemNumber("ABC23")
             .setNumberOfItemsInStorage(43).setCategoriesOfItems(1).getItem());

    this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Blue")
             .setItemDescription("Window For Building").setItemHeight(150).setItemLenght(200)
             .setItemPrice(333).setItemBrandName("WindowMan").setItemNumber("C3321")
             .setNumberOfItemsInStorage(54).setCategoriesOfItems(4).getItem());

    this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Green")
             .setItemDescription("This is wood from Norway").setItemHeight(25).setItemLenght(500)
             .setItemPrice(666).setItemBrandName("NorwegianWoodAS").setItemNumber("LOGR123")
             .setNumberOfItemsInStorage(23).setCategoriesOfItems(4).getItem());

    this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Green")
             .setItemDescription("This is wood from Norway premium").setItemHeight(25)
             .setItemLenght(500)
             .setItemPrice(800).setItemBrandName(brand).setItemNumber("LOG123")
             .setNumberOfItemsInStorage(100).setCategoriesOfItems(3).getItem());

    this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Brown")
             .setItemDescription("Flooring to house").setItemHeight(25).setItemLenght(100)
             .setItemPrice(1000).setItemBrandName(brand).setItemNumber("FLO123")
             .setNumberOfItemsInStorage(250).setCategoriesOfItems(2).getItem());

    this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Red")
             .setItemDescription("Fancy floor to house").setItemHeight(25).setItemLenght(150)
             .setItemPrice(1500).setItemBrandName(brand).setItemNumber("FLOR123")
             .setNumberOfItemsInStorage(4).setCategoriesOfItems(1).getItem());

    this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Blue")
              .setItemDescription("Fancy floor to house").setItemHeight(25).setItemLenght(150)
              .setItemPrice(2500).setItemBrandName(brand).setItemNumber("FLOP123")
              .setNumberOfItemsInStorage(100).setCategoriesOfItems(1).getItem());
  }
}
