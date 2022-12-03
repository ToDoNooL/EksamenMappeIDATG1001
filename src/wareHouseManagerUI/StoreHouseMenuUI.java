package wareHouseManagerUI;

import itemStorage.ItemBuilder;
import itemStorage.ItemRegister;
import java.util.Scanner;
import utilities.CheckIfValid;
import utilities.PrintUserInterface;

public class StoreHouseMenuUI
{
    private final ItemRegister itemRegister;
    private final PrintUserInterface printUserInterface;

    private final CheckIfValid checkIfValid;

    private boolean running;

    public StoreHouseMenuUI()
    {
    this.itemRegister = new ItemRegister();
    this.printUserInterface = new PrintUserInterface(itemRegister);
    this.checkIfValid = new CheckIfValid();
    fillItemRegisterWithCars();
    }
    public void start()
    {
        storeHouseMainMenu();
    }
    private void storeHouseMainMenu()
    {
    running = true;
    do
    {
        int userInput = 0;
        printUserInterface.printMainMenu();
        Scanner userInputForStoreHouse = new Scanner(System.in);
        boolean validUserInput = false;
        do
        {
            if (userInputForStoreHouse.hasNextInt())
            {
                userInput = userInputForStoreHouse.nextInt();
                if (checkIfValid.checkValidIntIntMenu(userInput))
                {
                    validUserInput = true;
                } else
                {
                    userInputForStoreHouse.next();
                    printUserInterface.printValidNumberFrom0to8();
                }
            }
        } while (!validUserInput);

        switch (userInput)
        {
            case 0:
                StoreHouseExit storeHouseExit = new StoreHouseExit(itemRegister);
                int userExit = storeHouseExit.getUserInput();
                switch (userExit)
                {
                    case 1:
                        printUserInterface.printLeavingMessage();
                        running = false;
                        break;
                    default:
                        printUserInterface.printReturningMessage();
                        storeHouseMainMenu();
                }
                break;
            case 1:
                printUserInterface.printNumberOfItemsInStorage();
                printUserInterface.printAllItems();
                break;
            case 2:
                break;
            case 3:
                StoreHouseAddItem storeHouseAddItem = new StoreHouseAddItem(itemRegister);
                storeHouseAddItem.addItemMenu();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                Scanner scanner = new Scanner(System.in);
                String userInputS = scanner.nextLine();
                itemRegister.deleteItemFromStorage(userInputS);
                break;
            case 7:
                break;
            case 8:
                break;

        }
    }while (running);
}





























    private void fillItemRegisterWithCars()
    {
            this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Yellow").setItemDescription("Big Box")
                .setItemHeight(75).setItemLenght(100).setItemPrice(100).setItemBrandName(
                    "WoodCooper").setItemNumber("ABC").setNumberOfItemsInStorage(10).getItem());

            this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Brown").setItemDescription(
                "Small Box").setItemHeight(60).setItemLenght(70).setItemPrice(250).setItemBrandName("BoxMan")
                .setItemNumber("ABC1").setNumberOfItemsInStorage(100).getItem());

            this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Brown").setItemDescription(
                    "Small Box").setItemHeight(60).setItemLenght(70).setItemPrice(200).setItemBrandName("BoxMan")
                .setItemNumber("ABC2").setNumberOfItemsInStorage(50).getItem());

            this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Brown").setItemDescription(
                    "A box we don't know").setItemHeight(100).setItemLenght(100).setItemPrice(500).
                setItemBrandName("BoxMan")
                .setItemNumber("ABC23").setNumberOfItemsInStorage(43).getItem());

            this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Blue").setItemDescription(
                    "Window For Building").setItemHeight(150).setItemLenght(200).setItemPrice(333).
                setItemBrandName("WindowMan")
                .setItemNumber("C3321").setNumberOfItemsInStorage(54).getItem());

            this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Green").setItemDescription(
                    "This is wood from Norway").setItemHeight(25).setItemLenght(500).setItemPrice(666).
                setItemBrandName("NorwegianWoodAS")
                .setItemNumber("LOGR123").setNumberOfItemsInStorage(23).getItem());

            this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Green").setItemDescription(
                    "This is wood from Norway premium").setItemHeight(25).setItemLenght(500).setItemPrice(800).
                setItemBrandName("NorwegianWoodAS")
                .setItemNumber("LOG123").setNumberOfItemsInStorage(100).getItem());

            this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Brown").setItemDescription(
                    "Flooring to house").setItemHeight(25).setItemLenght(100).setItemPrice(1000).
                setItemBrandName("NorwegianFoorAS")
                .setItemNumber("FLO123").setNumberOfItemsInStorage(250).getItem());

            this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Red").setItemDescription(
                    "Fancy floor to house").setItemHeight(25).setItemLenght(150).setItemPrice(1500).
                setItemBrandName("NorwegianFoorAS")
                .setItemNumber("FLOR123").setNumberOfItemsInStorage(4).getItem());

            this.itemRegister.addItem(new ItemBuilder().setColourOfItem("Blue").setItemDescription(
                    "Fancy floor to house").setItemHeight(25).setItemLenght(150).setItemPrice(2500).
                setItemBrandName("NorwegianFoorAS")
                .setItemNumber("FLOB123").setNumberOfItemsInStorage(1).getItem());
    }
}
