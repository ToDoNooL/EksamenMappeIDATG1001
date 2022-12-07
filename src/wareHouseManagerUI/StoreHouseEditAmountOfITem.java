package wareHouseManagerUI;

import itemstorage.ItemRegister;
import java.util.Scanner;
import utilities.PrintUserInterface;

public class StoreHouseEditAmountOfITem
{
    private final ItemRegister itemRegister;
    private final PrintUserInterface printUserInterface;
    private String searchUserInput = "";
    private int newAmount;

    public StoreHouseEditAmountOfITem(ItemRegister itemRegister)
    {
        this.itemRegister = itemRegister;
        this.printUserInterface = new PrintUserInterface(itemRegister);
    }

    public void increaseItemAmount()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter The ItemNumber Of The Item You Wanna Change The Amount");
        searchUserInput = scanner.nextLine();
        printUserInterface.printSearchItem(searchUserInput);
        System.out.println("Enter how many more there has been added in storages");
        newAmount = scanner.nextInt();
        itemRegister.setNewHigherAmountInStorages(searchUserInput, newAmount);
        printUserInterface.printSearchItem(searchUserInput);
    }
    public void decreaseItemAmount()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter The ItemNumber Of The Item You Wanna Change The Amount");
        searchUserInput = scanner.nextLine();
        printUserInterface.printSearchItem(searchUserInput);
        System.out.println("Enter how many more there has been taken from storages");
        newAmount = scanner.nextInt();
        itemRegister.setNewLowerAmountInStorage(searchUserInput, newAmount);
        printUserInterface.printSearchItem(searchUserInput);
    }
}
