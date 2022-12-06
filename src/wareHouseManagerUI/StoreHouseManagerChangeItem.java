package wareHouseManagerUI;

import itemStorage.ItemRegister;
import java.util.Scanner;
import utilities.CheckIfValid;
import utilities.PrintUserInterface;

public class StoreHouseManagerChangeItem
{
    public final ItemRegister itemRegister;
    public final PrintUserInterface printUserInterface;
    public final CheckIfValid checkIfValid;
    private String searchUserInput = "";
    private int newPrice;
    private int newDiscount;
    private String newDescription;
    private Scanner userInputForStoreHouse = new Scanner(System.in);

    public StoreHouseManagerChangeItem(ItemRegister itemRegister)
    {
        this.itemRegister = itemRegister;
        this.printUserInterface = new PrintUserInterface(itemRegister);
        this.checkIfValid = new CheckIfValid();
    }

    public void storeHouseManagerChangeItemMethod()
    {
        int userInput = 0;
        System.out.println("[1] set new Description");
        System.out.println("[2] set new Price");
        System.out.println("[3] set Discount on Item");
        System.out.println("[4] set Description/Price/Discount");
        System.out.println("[0] go back");
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




    public void setNewPriceOnItem()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter The ItemNumber Of The Item You Wanna Change The Price");
        searchUserInput = scanner.nextLine();
        printUserInterface.printSearchItem(searchUserInput);
        System.out.println("Enter The New Price Of The Item");
        newPrice = scanner.nextInt();
        itemRegister.setNewPriceOnItem(searchUserInput, newPrice);
        printUserInterface.printSearchItem(searchUserInput);
    }

    public void setDiscountOnItem()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter The ItemNumber Of The Item You Wanna set a Discount for");
        searchUserInput = scanner.nextLine();
        printUserInterface.printSearchItem(searchUserInput);
        System.out.println("Enter The New Discount on The Item");
        newDiscount = scanner.nextInt();
        itemRegister.setDiscountOnItem(searchUserInput, newDiscount);
        printUserInterface.printSearchItem(searchUserInput);
    }
    public void setNewDescription()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter The ItemNumber Of The Item You Wanna change description for");
        searchUserInput = scanner.nextLine();
        printUserInterface.printSearchItem(searchUserInput);
        System.out.println("Enter The New Description on The Item");
        newDescription = scanner.nextLine();
        itemRegister.setNewDescription(searchUserInput, newDescription);
        printUserInterface.printSearchItem(searchUserInput);
    }

    public void changeDescriptionPriceAndDiscount()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter The ItemNumber Of The Item You Wanna Set A New Value For");
        searchUserInput = scanner.nextLine();
        printUserInterface.printSearchItem(searchUserInput);
        System.out.println("Enter The Change On The Item");
        System.out.println("Set A New Description");
        newDescription = scanner.nextLine().trim();
        System.out.println("Set A New Price");
        newPrice = scanner.nextInt();
        System.out.println("Set A Discount");
        newDiscount = scanner.nextInt();
        itemRegister.setNewMethod(searchUserInput, newDescription, newPrice, newDiscount);
        printUserInterface.printSearchItem(searchUserInput);
    }
}
