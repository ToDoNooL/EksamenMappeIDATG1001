package wareHouseManagerUI;

import itemstorage.Item;
import itemstorage.ItemBuilder;
import itemstorage.ItemRegister;
import java.util.Locale;
import java.util.Scanner;
import utilities.CheckIfValid;
import utilities.PrintUserInterface;

public class StoreHouseAddItem
{
    private final PrintUserInterface printUserInterface;
    private final CheckIfValid checkIfValid;
    private final ItemRegister itemRegister;
    private int userInput = 0;
    private String tempValueString;
    private int tempValueInt;
    private float tempValueFloat;
    private int tempValueIntCategory;
    private final Scanner scannerForAddItem = new Scanner(System.in).useLocale(Locale.GERMAN);

    public StoreHouseAddItem(ItemRegister itemRegister)
    {
        this.itemRegister = itemRegister;
        this.printUserInterface = new PrintUserInterface(itemRegister);
        this.checkIfValid = new CheckIfValid();
    }

    private String waitForValidString(int infoText , int errorMessage)
    {
        switch (infoText)
        {
            case 1:
                printUserInterface.printEnterDescription();
                break;
            case 2:
                printUserInterface.printEnterColour();
                break;
            case 3:
                printUserInterface.printEnterBrand();
                break;
            case 4:
                printUserInterface.printEnterItemnumber();
                break;
            case 5:
                printUserInterface.printEnterNewDescription();
                break;
            case 6:
                printUserInterface.printEnterNewColour();
                break;
            case 7:
                printUserInterface.printEnterNewBrand();
                break;
            case 8:
                printUserInterface.printEnterNewItemNumber();
                break;
        }
        boolean validDescription = false;
        do
        {
            String temp = scannerForAddItem.next().trim();
            if (checkIfValid.checkIfValidString(temp))
            {
                tempValueString = temp;
                validDescription = true;
            }
            else if (!checkIfValid.checkIfValidString(temp))
            {
                scannerForAddItem.nextLine();
                switch (errorMessage)
                {
                    case 1:
                        printUserInterface.printValidDescription();
                        break;
                    case 2:
                        printUserInterface.printValidColour();
                        break;
                    case 3:
                        printUserInterface.printValidBrand();
                        break;
                    case 4:
                        printUserInterface.printValidItemNumber();
                        break;
                }
            }
        } while (!validDescription);
        return tempValueString;
    }
    private int waitForValidInt(int infoText , int errorMessage)
    {
        switch (infoText)
        {
            case 1:
                printUserInterface.printEnterPrice();
                break;
            case 2:
                printUserInterface.printEnterNewPrice();
                break;
            case 3:
                printUserInterface.printEnterAmountOfItem();
                break;
        }
        boolean validPrice = false;
        do
        {
            if (scannerForAddItem.hasNextInt())
            {
                int temp = scannerForAddItem.nextInt();
                if (checkIfValid.checkIfNumberIsNotLowerThanZero(temp))
                {
                    tempValueInt = temp;
                    validPrice = true;
                }
            }
            else
            {
                scannerForAddItem.next();
                switch (errorMessage)
                {
                    case 1:
                        printUserInterface.printValidPrice();
                        break;
                    case 2:
                        printUserInterface.printValidAmount();
                        break;
                }
            }
        } while (!validPrice);
        return tempValueInt;
    }
    private int waitForValidCategory()
    {
        printUserInterface.printEnterForItemCategory();
        boolean validPrice = false;
        do
        {
            if (scannerForAddItem.hasNextInt())
            {
                int temp = scannerForAddItem.nextInt();
                if (checkIfValid.checkValidIntCategory(temp))
                {
                    tempValueIntCategory = temp;
                    validPrice = true;
                }
            }
            else
            {
                scannerForAddItem.next();
            }
        } while (!validPrice);
        return tempValueIntCategory;
    }
    private float waitForValidFloat(int infoText, int errorMessage)
    {
        switch (infoText)
        {
            case 1:
                printUserInterface.printEnterWeight();
                break;
            case 2:
                printUserInterface.printEnterLenght();
                break;
            case 3:
                printUserInterface.printEnterHeight();
                break;
            case 4:
                printUserInterface.printEnterNewWeight();
                break;
            case 5:
                printUserInterface.printEnterNewLenght();
                break;
            case 6:
                printUserInterface.printEnterNewHeight();
        }
        boolean validWeight = false;
        do
        {
            if (scannerForAddItem.hasNextFloat())
            {
                float temp = scannerForAddItem.nextFloat();
                if (checkIfValid.checkIfValidFloat(temp))
                {
                    tempValueFloat = temp;
                    validWeight = true;
                }
            }
            else
            {
                scannerForAddItem.next();
                switch (errorMessage)
                {
                    case 1:
                        printUserInterface.printValidWeight();
                        break;
                    case 2:
                        printUserInterface.printValidLenght();
                        break;
                    case 3:
                        printUserInterface.printValidHeight();
                        break;
                }
            }
        } while (!validWeight);
        return tempValueFloat;
    }

    public void addItemMenu()
    {
        printUserInterface.printAddItemMenu();
        boolean userInputValid = false;
        do
        {
            if (scannerForAddItem.hasNextInt())
            {
                userInput = scannerForAddItem.nextInt();
                if (checkIfValid.checkValidIntAddItem(userInput))
                {
                    userInputValid = true;
                }
            }
            else
            {
                scannerForAddItem.nextLine();
                printUserInterface.printValidNumberFrom0to2();
                scannerForAddItem.next();
            }
        } while (!userInputValid);
        switch (userInput)
        {
            case 1:
                addItem();
                break;
            case 2:
                StoreHouseMenuUI storeHouseMenuUI = new StoreHouseMenuUI();
                storeHouseMenuUI.start();
                break;
        }
    }
    private void addItem()
    {
        String itemDescription = ""; //A small Description of the item
        String itemNumber = ""; //AKA. ItemName
        int itemPrice = 0; //the price of the item
        String itemBrandName = ""; //Brand name of the item
        float itemWeight = 0; //The weight of the item in KG
        float itemLenght = 0; //Length Of the Item
        float itemHeight = 0; // The Height Of the Item
        String colourOfItem = ""; //The colour of the item
        int itemAmount = 0; //The Amount Of items In Storage
        int itemCategory = 0; //The Category of the item, Enum

        itemDescription = waitForValidString(1,1);

        itemPrice = waitForValidInt(1,1);

        colourOfItem = waitForValidString(2,2);

        itemWeight = waitForValidFloat(1,1);

        itemBrandName = waitForValidString(3,3);

        itemLenght = waitForValidFloat(2,2);

        itemHeight = waitForValidFloat(3,3);

        itemNumber = waitForValidString(4,4);

        itemAmount = waitForValidInt(3,2);

        itemCategory = waitForValidCategory();




        Item item =
            new ItemBuilder().setColourOfItem(colourOfItem).setItemNumber(itemNumber).setItemPrice(itemPrice)
            .setItemBrandName(itemBrandName).setItemLenght(itemLenght).setItemHeight(itemHeight).setItemWeight(itemWeight)
            .setItemDescription(itemDescription).setNumberOfItemsInStorage(itemAmount).setCategoriesOfItems(itemCategory).getItem();
        itemRegister.addItem(item);
    }

    public void confirmItem()
    {
        boolean userInputValid = false;
        printUserInterface.printConfirmMenuForItem();
        do
        {
            if (scannerForAddItem.hasNextInt())
            {
                userInput = scannerForAddItem.nextInt();
                if (checkIfValid.checkIfValidAddToList(userInput))
                {
                    userInputValid = true;
                } else if (!checkIfValid.checkIfValidAddToList(userInput))
                {
                    scannerForAddItem.nextLine();
                    printUserInterface.printValidNumberFrom0to2();
                }
            } else
            {
                scannerForAddItem.next();
                printUserInterface.printValidNumberFrom0to2();
            }
        } while (!userInputValid);

        switch (userInput)
        {
            case 1:
                printNewItem();
                break;
            case 2:
                break;
            case 0:
                addItemMenu();
                break;
        }
    }
    public void printNewItem()
    {
        printUserInterface.printConfirmItemMenu();
        boolean userInputValid2 = false;
        do
        {
            if (scannerForAddItem.hasNextInt())
            {
                userInput = scannerForAddItem.nextInt();
                if (checkIfValid.checkValidIntInExit(userInput))
                {
                    userInputValid2 = true;
                } else if (!checkIfValid.checkValidIntInExit(userInput))
                {
                    scannerForAddItem.nextLine();
                    printUserInterface.printValidNumberFrom0to1();
                }
            } else
            {
                scannerForAddItem.next();
                printUserInterface.printValidNumberFrom0to1();
            }
        } while (!userInputValid2);

        switch (userInput)
        {
            case 1:
                break;
            case 0:
                confirmItem();
                break;

        }

    }
}
