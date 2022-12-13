package utilities;

import itemstorage.Item;
import itemstorage.ItemRegister;
import java.util.Iterator;
import java.util.Scanner;


/**
 * This class is used to print all the messages in the Application.

 *  @author Eskil Alstad
 *
 *  @version 2022-12-07
 */
public class PrintUserInterface {
  private final ItemRegister itemRegister;
  private final CheckIfValid checkIfValid;
  private static final String PRICE = "PRICE NOK";
  private static final String NUMBER = "ITEM NUMBER";
  private static final String DESCRIPTION = "ITEM DESCRIPTION";
  private static final String BRAND = "ITEM BRAND";
  private static final String AMOUNT = "ITEM AMOUNT";
  private static final String CATEGORY = "ITEM CATEGORY";
  private static final String SOUTF = "%-20s  %-20s  %-40s  %-30s  %-20s %n";
  private final Scanner userReadInput;

  /**
   * This method passes the itemRegister so this class can use it.

   * @param itemRegister passes the itemRegister.
   */
  public PrintUserInterface(ItemRegister itemRegister) {
    this.itemRegister = itemRegister;
    this.checkIfValid = new CheckIfValid();
    userReadInput = new Scanner(System.in);
  }

  /**
   * This Method Prints the MainMenu For The Application.
   */
  public void printMainMenu() {
    System.out.println("\nWelcome to SmartHusAS Menu");
    System.out.println(
        new StringBuilder().append("\n Options: \n ")
            .append("[1]: Print All Items In Storage \n ")
            .append("[2]: Search For A Item In Storage \n ")
            .append("[3]: Add A New Item To Storage \n ")
            .append("[4]: Increase Amount Of A Item In Storage \n ")
            .append("[5]: Decrease Amount Of A Item In Storage \n ")
            .append("[6]: Delete A Item  In Storage\n ")
            .append("[7]: Set A Discount or Change A Item In Storage \n ")
            .append("[8]: If You Need Help \n ")
            .append("[0]: To Exit The Program \n "));
  }

  /**
   * This Method Prints the Welcome message to Help menu.
   */
  public void printHelpWelcome() {
    System.out.println("\nWelcome to the SmartHouseAs helpdesk");
    System.out.println("What do you need help with? ");
  }

  /**
   * This methodPrints the Help Menu.
   */
  public void printHelp() {
    System.out.println("We are currently to busy whit Helseplattformen");
    System.out.println("Come back later and see if the help site is up.");
  }

  /**
   * Prints the Exit Menu.
   */
  public void printExit() {
    System.out.println("\nAre you sure you wanna exit the program? ");
    System.out.println("[1]: YES");
    System.out.println("[0]: NO");
  }

  /**
   * This method Prints the error message if the number is not valid, outside the range of 0
   * and 8.
   */
  public void printValidNumberFrom0to8() {
    System.out.println("Please Enter a Valid Number [0 to 8]");
  }

  /**
   * This Method Prints the error message if the number is not valid, outside the range of 0
   * and 4.
   */
  public void printValidNumberFrom0to4() {
    System.out.println("Please Enter a Valid Number [0 to 4]");
  }

  /**
   * This method Prints the error message if the number is not valid, outside the range of 0
   * and 1.
   */
  public void printValidNumberFrom0to1() {
    System.out.println("Please Enter a Valid Number [0 or 1]");
  }

  /**
   * This method Prints the error message if the number is not valid, outside the range of 0
   * and 2.
   */
  public void printValidNumberFrom0to2() {
    System.out.println("Please Enter a Valid Number [0 to 2]");
  }

  /**
   * This method Prints the Going back Message.
   */
  public void printReturningMessage() {
    System.out.println("Going back to where you left off");
  }

  /**
   * This method Prints the Message when you are leaving the Application.
   */
  public void printLeavingMessage() {
    System.out.println("Bye have a nice day come back to work tomorrow");
  }

  /**
   * This method Prints the Add Item Menu.
   */
  public void printAddItemMenu() {
    System.out.println("\nDo You Wanna Add A New Item?: ");
    System.out.println("[1] Add a new Item");
    System.out.println("[2] Go Back To Menu");
  }

  /**
   * This method Prints the Enter Description message.
   */
  public void printEnterDescription() {
    System.out.println("Please enter a description of the item");
  }

  /**
   * This method Prints the Not valid Description message.
   */
  public void printValidDescription() {
    System.out.println("Please enter a Valid description of the item");
  }

  /**
   * This method Prints the Enter price message.
   */
  public void printEnterPrice() {
    System.out.println("Please Enter the Price of the item");
  }

  /**
   * This method Prints the Not valid Price message.
   */
  public void printValidPrice() {
    System.out.println("Please Enter a Valid Price");
  }

  /**
   * This method Prints the Enter Colour message.
   */
  public void printEnterColour() {
    System.out.println("Enter the Colour of the item");
  }

  /**
   * This method Prints the Not Valid Colour message.
   */
  public void printValidColour() {
    System.out.println("please enter a valid Colour");
  }

  /**
   * This method Prints the Enter Weight message.
   */
  public void printEnterWeight() {
    System.out.println("Enter the weight of the item");
  }

  /**
   * This method Prints the Not Valid Weight message.
   */
  public void printValidWeight() {
    System.out.println("Please enter a Valid weight for item");
  }

  /**
   * This method Prints the Enter Brand message.
   */
  public void printEnterBrand() {
    System.out.println("Enter the Brand of The item");
  }

  /**
   * This method Prints the Not Valid Brand message.
   */
  public void printValidBrand() {
    System.out.println("please enter a valid Brand name");
  }

  /**
   * This method Prints the Enter Lenght message.
   */
  public void printEnterLenght() {
    System.out.println("Enter the Length of the Item");
  }

  /**
   * This method Prints the Not Valid Lenght message.
   */
  public void printValidLenght() {
    System.out.println("Please enter a Valid Lenght for item");
  }

  /**
   * This method Prints the Enter Height message.
   */
  public void printEnterHeight() {
    System.out.println("Enter the Height of the Item");
  }

  /**
   * This method Prints the Not Valid Height message.
   */
  public void printValidHeight() {
    System.out.println("Please enter a Valid Height for item");
  }

  /**
   * This method Prints the Enter ItemNumber message.
   */
  public void printEnterItemNumber() {
    System.out.println("Enter the itemNumber of the Item");
  }

  /**
   * This method Prints the Not Valid ItemNumber message.
   */
  public void printValidItemNumber() {
    System.out.println("please enter a valid ItemNumber");
  }

  /**
   * This method Prints the Confirm item menu.
   */
  public void printConfirmItemMenu() {
    System.out.println("Do you wanna add another item?");
    System.out.println("[1] Add Another Item");
    System.out.println("[0] Go Back");
  }

  /**
   * This method prints the Edit item Menu.
   */
  public void printEditItemMenu() {
    System.out.println("Edit the Item");
    System.out.println("[1]: Edit price of item");
    System.out.println("[2]: Edit Colour Of Item");
    System.out.println("[3]: Edit Weight Of Item");
    System.out.println("[4]: Edit BrandName Of Item");
    System.out.println("[5]: Edit Lenght Of Item");
    System.out.println("[6]: Edit Height of Item");
    System.out.println("[7]: Edit ItemNumber");
    System.out.println("[8]: Edit The Description of the Item");
    System.out.println("[0]: Go Back");
  }

  /**
   * This method Prints the New Price of the Item.
   */
  public void printEnterNewPrice() {
    System.out.println("\nEnter the New Price of the item\n");
  }

  /**
   * This Method Prints the New Colour of the Item.
   */
  public void printEnterNewColour() {
    System.out.println("\nEnter the new colour\n");
  }

  /**
   * This method Prints the New Weight of the Item.
   */
  public void printEnterNewWeight() {
    System.out.println("\nEnter new Weight of Item\n");
  }

  /**
   * This method Prints the New Brand of the Item.
   */
  public void printEnterNewBrand() {
    System.out.println("\nEnter new Brand on Item\n");
  }

  /**
   * This method Prints the New Lenght of the Item.
   */
  public void printEnterNewLenght() {
    System.out.println("\nSet new Lenght of item\n");
  }

  /**
   * This method Prints the New Height of the Item.
   */
  public void printEnterNewHeight() {
    System.out.println("\nSet New Height on Item\n");
  }

  /**
   * This method Prints the New ItemNumber of the Item.
   */
  public void printEnterNewItemNumber() {
    System.out.println("\nSet new ItemNumber\n");
  }

  /**
   * This method Prints the New Description of the Item.
   */
  public void printEnterNewDescription() {
    System.out.println("\nSet new Item Description\n");
  }

  /**
   * This method Prints the ConfirmMenu.
   */
  public void printConfirmMenuForItem() {
    System.out.println("This is your item");
    System.out.println();
    System.out.println("Do you wanna keep this item");
    System.out.println("[1]: Yes");
    System.out.println("[2]: Edit Item");
    System.out.println("[0]: No");
  }

  /**
   * This method Prints the amount of items in register as int.
   */
  public void printNumberOfItemsInStorage() {
    System.out.println(itemRegister.getNumberOfItems());
  }

  /**
   * This method Prints all the items in register, ItemPrice, ItemNumber, ItemDescription,
   * BrandName, NumberOfItemsInStorage.
   */
  public void printAllItems() {
    Iterator<Item> it = this.itemRegister.getIterator();
    System.out.printf(SOUTF,
            PRICE, NUMBER, DESCRIPTION, BRAND, AMOUNT);
    System.out.println("----------------------------------------------------");
    while (it.hasNext()) {
      Item item = it.next();
      // First create the text to display the borrowed status
      System.out.printf(SOUTF,
                item.getItemPrice() + "KR.", item.getItemNumber() + ".",
                item.getItemDescription() + ".", item.getItemBrandName() + ".",
                item.getNumberOfItemsInStorage() + ".");
    }
  }

  /**
   * This method Prints all the items in register, With all parameters.
   */
  public void printAllItemsWithAllDetails() {
    int number = 1;
    Iterator<Item> it = this.itemRegister.getIterator();
    System.out.printf("%-20s  %-20s  %-40s  %-30s  %-20s %n  %-20s  %-20s  %-20s  %-20s  %-20s %n",
            PRICE, NUMBER, DESCRIPTION, BRAND, AMOUNT, CATEGORY, "ITEM LENGHT",
        "ITEM HEIGHT", "ITEM WEIGHT", "ITEM COLOUR");
    System.out.println("---------------------------------------------------------------------");
    while (it.hasNext()) {
      Item item = it.next();
      System.out.println("Number " + number);
      System.out.printf("%-20s  %-20s  %-40s  %-30s  %-20s %n  %-20s  %-20s  %-20s  %-20s %-20s %n",
          item.getItemPrice() + " KR.", item.getItemNumber() + ".", item.getItemDescription() + ".",
          item.getItemBrandName() + ".", item.getNumberOfItemsInStorage() + ".",
          item.getCategoriesOfItems() + ".", item.getItemLenght() + " CM.",
          item.getItemHeight() + " CM.", item.getItemWeight() + " KG.",
          item.getColourOfItem() + ".");
      System.out.println(
          "-----------------------------------------------------------------------------------");
      number++;
    }
  }

  /**
   * Prints one category from an userInput.
   */
  public void printOneCategory() {
    int userInput = 0;
    boolean validUserInput = false;
    do {
      if (userReadInput.hasNextInt()) {
        userInput = userReadInput.nextInt();
        if (checkIfValid.checkValidIntBetweenZeroAndFour(userInput)) {
          validUserInput = true;
        }
      } else {
        userReadInput.nextLine();
        System.out.println("Enter a valid number.");
      }
    } while (!validUserInput);
    Iterator<Item> it = this.itemRegister.getIterator();
    System.out.printf("%-20s  %-20s  %-40s  %-30s  %-20s %n  %-20s %n",
        PRICE, NUMBER, DESCRIPTION, BRAND, AMOUNT, CATEGORY);
    System.out.println(
        "---------------------------------------------------------------------");
    while (it.hasNext()) {
      Item item = it.next();
      if (item.getCategoriesOfItems().getNumber() == userInput) {
        System.out.printf("%-20s  %-20s  %-40s  %-30s  %-20s  %-20s %n",
            item.getItemPrice() + " KR.", item.getItemNumber() + ".",
            item.getItemDescription() + ".", item.getItemBrandName() + ".",
            item.getNumberOfItemsInStorage() + ".", item.getCategoriesOfItems() + ".");
      }
    }
  }

  /**
   * This method Prints Enter itemNumber for deleting.
   */
  public void printHowToDeleteItem() {
    System.out.println("Enter The ItemNumber Of The Item You Want To Delete: ");
  }

  /**
   * This method Prints confirm message for delete item.
   */
  public void printAreYouSure() {
    System.out.println("Are You Sure You Wanna Delete This Item? ");
  }

  /**
   * This method Prints Item no found message.
   */
  public void printItemNotFound() {
    System.out.println("Item was not found");
  }

  /**
   * Prints item has been deleted message.
   */
  public void printItemDeleted() {
    System.out.println("Item Has Been Deleted");
  }

  /**
   * This method Prints confirm delete menu.
   */
  public void printConfirmMenuDelete() {
    System.out.println("[1] Yes Delete this item.");
    System.out.println("[0] No Keep Item");
  }

  /**
   * This method Prints the Enter Amount of item to add.
   */
  public void printEnterAmountOfItem() {
    System.out.println("Enter the Amount of The Item You wanna Add");
  }

  /**
   * This method Prints the error if not valid.
   */
  public void printValidAmount() {
    System.out.println("Enter A Valid Amount");
  }

  /**
   * This method Prints the Enter new Amount added to Register.
   */
  public void printEnterNewAmountItem() {
    System.out.println("Enter The How Much You Wanna Increase the item Amount with: ");
  }

  /**
   * This method Prints the Enter new Amount taken from Register.
   */
  public void printEnterSmallerAmountItem() {
    System.out.println("Enter The How Much You Wanna Decrease the item Amount with: ");
  }

  /**
   * This method prints the Change item Menu.
   */
  public void printChangeItemMenu() {
    System.out.println("[1] set new Description");
    System.out.println("[2] set new Price");
    System.out.println("[3] set Discount on Item");
    System.out.println("[4] set Description/Price/Discount");
    System.out.println("[0] go back");
  }

  /**
   * This Method prints to enter new discount message.
   */
  public void printEnterNewDiscount() {
    System.out.println("Enter The New Discount on The Item");
  }

  /**
   * This method Prints Enter category menu with Enum.
   */
  public void printEnterForItemCategory() {
    System.out.println("Enter The Corresponding number for right category");
    System.out.println("[1] Floor Laminates");
    System.out.println("[2] Windows");
    System.out.println("[3] Doors");
    System.out.println("[4] Lumber");
    System.out.println("[0] Not sure(Can set later if you don't know the category)");
  }

  /**
   * This method prints the menu for choosing menu for category.
   */
  public void printEnterNumberForCategory() {
    System.out.println("Enter The number to print the category");
    System.out.println("[1] Floor Laminates");
    System.out.println("[2] Windows");
    System.out.println("[3] Doors");
    System.out.println("[4] Lumber");
  }

  /**
   * The method prints one item from ItemNumber.

   * @param searchUserInput Takes the itemNumber to search for an Item in register.
   */
  public void printSearchItem(String searchUserInput) {
    Iterator<Item> it = this.itemRegister.foundItemsByItemNumber(searchUserInput);
    boolean printHeader = true;
    while (it.hasNext()) {
      Item item = it.next();
      if (item.getItemNumber().equalsIgnoreCase(searchUserInput)) {
        if (printHeader) {
          System.out.printf(SOUTF,
              PRICE, NUMBER, DESCRIPTION, BRAND, AMOUNT);
          System.out.println("---------------------------------------------------------");
          printHeader = false;
        }
        // First create the text to display the borrowed status
        System.out.printf(SOUTF,
                    item.getItemPrice() + " KR.", item.getItemNumber() + ".",
                    item.getItemDescription() + ".", item.getItemBrandName() + ".",
                    item.getNumberOfItemsInStorage() + ".");
      }
    }
  }

  /**
   * This method prints the menu for if you want to print all items in register or only one
   * category.
   */
  public void whatToPrint() {
    System.out.println("[1] Print all Items In Register.");
    System.out.println("[2] Print only One Category in Register.");
    System.out.println("[3] Print all Items in Register With All Info.");
    int userInput = 0;
    boolean validUserInput = false;
    do {
      if (userReadInput.hasNextInt()) {
        userInput = userReadInput.nextInt();
        if (checkIfValid.checkIfValidBetweenOneOrThree(userInput)) {
          validUserInput = true;
        }
      } else {
        userReadInput.nextLine();
        System.out.println("Enter a Valid number");
      }
    } while (!validUserInput);
    switch (userInput) {
      case 1 -> printAllItems();
      case 2 -> {
        printEnterNumberForCategory();
        printOneCategory();
      }
      case 3 -> printAllItemsWithAllDetails();
      default -> whatToPrint();
    }
  }
}

