package utilities;

import itemstorage.Item;
import itemstorage.ItemRegister;
import java.util.Iterator;

/**
 * This Class is Used for All System.out Messages in this Application
 * TODO add more.
 */
public class PrintUserInterface
{
    private final ItemRegister itemRegister;
    /**
     * Prints the MainMenu For The Application
     */

    public PrintUserInterface(ItemRegister itemRegister)
    {
        this.itemRegister = itemRegister;
    }
    public void printMainMenu()
    {
        System.out.println("\nWelcome to SmartHusAS Menu");
        System.out.println(
            new StringBuilder().append("\n Options: \n ")
                .append("[1]: Print All Items In Storage \n ")
                .append("[2]: Search For A Item In Storage \n ")
                .append("[3]: Add A New Item To Storage \n ")
                .append("[4]: Increase Amount Of A Item In Storage \n ")
                .append("[5]: Decrease Amount Of A Item In Storage \n ")
                .append("[6]: Delete A Item  In Storage\n ")
                .append("[7]: Set Or Delete A Discount On A Item In Storage \n ")
                .append("[8]: If You Need Help \n ")
                .append("[0]: To Exit The Program \n "));
    }

    /**
     * Prints the Welcome message to Help menu
     */
    public void printHelpWelcome()
    {
        System.out.println("\nWelcome to the SmartHouseAs helpdesk");
        System.out.println("What do you need help with? ");
    }

    /**
     * Prints the Help Menu
     */
    public void printHelp()
    {
        System.out.println("\nOptions: ");
        System.out.println("[1]: How Do I Add A Item");
        System.out.println("[2]: How Do I Delete A Item");
        System.out.println("[3]: How Do Mass Add Items");
        System.out.println("[4]: How Do I Mass Delete Items");
        System.out.println("[5]: Return Back To Menu");
    }

    /**
     * Prints the Exit Menu
     */
    public void printExit()
    {
        System.out.println("\nAre you sure you wanna exit the program? ");
        System.out.println("[1]: YES");
        System.out.println("[0]: NO");
    }

    /**
     * Prints the error message if the number is not valid, outside the range of 0 and 8
     */
    public void printValidNumberFrom0to8()
    {
        System.out.println("Please Enter a Valid Number [0 to 8]");
    }

    /**
     * Prints the error message if the number is not valid, outside the range of 0 and 4
     */
    public void printValidNumberFrom0to4()
    {
        System.out.println("Please Enter a Valid Number [0 to 4]");
    }
    /**
     * Prints the error message if the number is not valid, outside the range of 0 and 1
     */
    public void printValidNumberFrom0to1()
    {
        System.out.println("Please Enter a Valid Number [0 or 1]");
    }
    /**
     * Prints the error message if the number is not valid, outside the range of 0 and 2
     */
    public void printValidNumberFrom0to2()
    {
        System.out.println("Please Enter a Valid Number [0 to 2]");
    }

    /**
     * Prints the Going back Message
     */
    public void printReturningMessage()
    {
        System.out.println("Going back to where you left off");
    }

    /**
     * Prints the Message when you are leaving the Application
     */
    public void printLeavingMessage()
    {
        System.out.println("Bye have a nice day come back to work tomorrow");
    }

    /**
     * Prints the Add Item Menu
     */
    public void printAddItemMenu()
    {
        System.out.println("\nWelcome to Where we add a item");
        System.out.println("[1] Add a new Item");
        System.out.println("[2] Go Back To Menu");
    }

    /**
     * Prints the Enter Description message
     */
    public void printEnterDescription()
    {
        System.out.println("Please enter a description of the item");
    }
    /**
     * Prints the Not valid Description message
     */
    public void printValidDescription()
    {
        System.out.println("Please enter a Valid description of the item");
    }
    /**
     * Prints the Enter price message
     */
    public void printEnterPrice()
    {
        System.out.println("Please Enter the Price of the item");
    }
    /**
     * Prints the Not valid Price message
     */
    public void printValidPrice()
    {
        System.out.println("Please Enter a Valid Price");
    }
    /**
     * Prints the Enter Colour message
     */
    public void printEnterColour()
    {
        System.out.println("Enter the Colour of the item");
    }
    /**
     * Prints the Not Valid Colour message
     */
    public void printValidColour()
    {
        System.out.println("please enter a valid Colour");
    }
    /**
     * Prints the Enter Weight message
     */
    public void printEnterWeight()
    {
        System.out.println("Enter the weight of the item");
    }
    /**
     * Prints the Not Valid Weight message
     */
    public void printValidWeight()
    {
        System.out.println("Please enter a Valid weight for item");
    }
    /**
     * Prints the Enter Brand message
     */
    public void printEnterBrand()
    {
        System.out.println("Enter the Brand of The item");
    }
    /**
     * Prints the Not Valid Brand message
     */
    public void printValidBrand()
    {
        System.out.println("please enter a valid Brand name");
    }
    /**
     * Prints the Enter Lenght message
     */
    public void printEnterLenght()
    {
        System.out.println("Enter the Length of the Item");
    }
    /**
     * Prints the Not Valid Lenght message
     */
    public void printValidLenght()
    {
        System.out.println("Please enter a Valid Lenght for item");
    }
    /**
     * Prints the Enter Height message
     */
    public void printEnterHeight()
    {
        System.out.println("Enter the Height of the Item");
    }
    /**
     * Prints the Not Valid Height message
     */
    public void printValidHeight()
    {
        System.out.println("Please enter a Valid Height for item");
    }
    /**
     * Prints the Enter ItemNumber message
     */
    public void printEnterItemnumber()
    {
        System.out.println("Enter the itemNumber of the Item");
    }
    /**
     * Prints the Not Valid ItemNumber message
     */
    public void printValidItemNumber()
    {
        System.out.println("please enter a valid ItemNumber");
    }

    /**
     * Prints the Confirm item menu
     */
    public void printConfirmItemMenu()
    {
        System.out.println("Do you wanna add another item?");
        System.out.println("[1] Add Another Item");
        System.out.println("[0] Go Back");
    }

    /**
     * prints the Edit item Menu
     */
    public void printEditItemMenu()
    {
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
     * Prints the New Price of the Item
     */
    public void printEnterNewPrice()
    {
        System.out.println("\nEnter the New Price of the item\n");
    }
    /**
     * Prints the New Colour of the Item
     */
    public void printEnterNewColour()
    {
        System.out.println("\nEnter the new colour\n");
    }
    /**
     * Prints the New Weight of the Item
     */
    public void printEnterNewWeight()
    {
        System.out.println("\nEnter new Weight of Item\n");
    }
    /**
     * Prints the New Brand of the Item
     */
    public void printEnterNewBrand()
    {
        System.out.println("\nEnter new Brand on Item\n");
    }
    /**
     * Prints the New Lenght of the Item
     */
    public void printEnterNewLenght()
    {
        System.out.println("\nSet new Lenght of item\n");
    }
    /**
     * Prints the New Height of the Item
     */
    public void printEnterNewHeight()
    {
        System.out.println("\nSet New Height on Item\n");
    }
    /**
     * Prints the New ItemNumber of the Item
     */
    public void printEnterNewItemNumber()
    {
        System.out.println("\nSet new ItemNumber\n");
    }
    /**
     * Prints the New Description of the Item
     */
    public void printEnterNewDescription()
    {
        System.out.println("\nSet new Item Description\n");
    }
    public void printConfirmMenuForItem()
    {
        System.out.println("This is your item");
        System.out.println();
        System.out.println("Do you wanna keep this item");
        System.out.println("[1]: Yes");
        System.out.println("[2]: Edit Item");
        System.out.println("[0]: No");
    }

    public void printNumberOfItemsInStorage()
    {
        System.out.println(itemRegister.getNumberOfItems());
    }

    public void printAllItems()
    {
        Iterator<Item> it = this.itemRegister.getIterator();
        System.out.printf("%-20s  %-20s  %-40s  %-30s  %-20s %n",
            "Price NOK", "ItemNumber", "Item Description", "Item Brand" , "Amount Left");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        while (it.hasNext()) {
            Item item = it.next();
            // First create the text to display the borrowed status
            System.out.printf("%-20d  %-20s  %-40s  %-30s  %-20s %n",
                item.getItemPrice(),item.getItemNumber(),item.getItemDescription(),
                item.getItemBrandName(),item.getNumberOfItemsInStorage());
        }
    }
    public void printAllItemsWithAllDetails()
    {
        Iterator<Item> it = this.itemRegister.getIterator();
        System.out.printf("%-20s  %-20s  %-40s  %-30s  %-20s  %-20s %n",
            "Price NOK", "ItemNumber", "Item Description", "Item Brand" , "Amount Left", "Item " +
                "Category");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        while (it.hasNext()) {
            Item item = it.next();
            // First create the text to display the borrowed status
            System.out.printf("%-20d  %-20s  %-40s  %-30s  %-20s  %-20s %n",
                item.getItemPrice(),item.getItemNumber(),item.getItemDescription(),
                item.getItemBrandName(),item.getNumberOfItemsInStorage(),item.getCategoriesOfItems());
        }
    }

    public void printHowToDeleteItem()
    {
        System.out.println("Enter The ItemNumber Of The Item You Want To Delete: ");
    }
    public void printAreYouSure()
    {
        System.out.println("Are You Sure You Wanna Delete This Item? ");
    }
    public void printItemNotFound()
    {
        System.out.println("Item was not found");
    }
    public void printItemDeleted()
    {
        System.out.println("Item Has Been Deleted");
    }

    public void printConfirmMenuDelete()
    {
        System.out.println("[1] Yes Delete this item.");
        System.out.println("[0] No Keep Item");
    }
    public void printEnterAmountOfItem()
    {
        System.out.println("Enter the Amount of The Item You wanna Add");
    }
    public void printValidAmount()
    {
        System.out.println("Enter A Valid Amount");
    }
    public void printEnterForItemCategory()
    {
        System.out.println("Enter The Corresponding number for right category");
        System.out.println("[1] Floor Laminates");
        System.out.println("[2] Windows");
        System.out.println("[3] Doors");
        System.out.println("[4] Lumber");
        System.out.println("[0] Not sure(Can set later if you don't know the category)");
    }
    public void printSearchItem(String searchUserInput)
    {
        Iterator<Item> it = this.itemRegister.foundItemsByItemNumber(searchUserInput);
        boolean printHeader = true;
        boolean itemFound = false;
        while (it.hasNext()) {
            Item item = it.next();
            if (item.getItemNumber().equalsIgnoreCase(searchUserInput)) {
                itemFound =true;
                if (printHeader) {
                    System.out.printf("%-20s  %-20s  %-40s  %-30s  %-20s %n",
                        "Price NOK", "ItemNumber", "Item Description", "Item Brand" , "Amount Left");
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    printHeader = false;
                }
                // First create the text to display the borrowed status
                System.out.printf("%-20d  %-20s  %-40s  %-30s  %-20s %n",
                    item.getItemPrice(),item.getItemNumber(),item.getItemDescription(),
                    item.getItemBrandName(),item.getNumberOfItemsInStorage());
            }
        }
    }

}

