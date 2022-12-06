package wareHouseManagerUI;

import itemStorage.ItemRegister;
import java.util.Iterator;
import java.util.Scanner;
import utilities.CheckIfValid;
import utilities.PrintUserInterface;

public class StoreHouseDeleteItem
{
    private final ItemRegister itemRegister;
    private final PrintUserInterface printUserInterface;
    private int userInput = 0;
    private Scanner userInputDelete = new Scanner(System.in);
    private CheckIfValid checkIfValid = new CheckIfValid();
    public StoreHouseDeleteItem(ItemRegister itemRegister)
    {
        this.itemRegister = itemRegister;
        this.printUserInterface = new PrintUserInterface(itemRegister);
    }
    public void deleteItemV2(String searchUserInput)
    {
        printUserInterface.printHowToDeleteItem();
        boolean userInputValid = false;
        do
        {
            if (userInputDelete.hasNextLine())
            {
                searchUserInput = userInputDelete.nextLine();
                if (checkIfValid.checkIfValidString(searchUserInput))
                {
                    userInputValid = true;
                }
            }
            else
            {
                userInputDelete.nextLine();
                userInputDelete.next();
            }
        } while (!userInputValid);
        itemRegister.foundItemsByItemNumber(searchUserInput);
        printUserInterface.printSearchItem(searchUserInput);

        printUserInterface.printConfirmMenuDelete();
        boolean userInputValidV2 = false;
        do
        {
            if (userInputDelete.hasNextInt())
            {
                userInput = userInputDelete.nextInt();
                if (checkIfValid.checkValidIntInExit(userInput))
                {
                    userInputValidV2 = true;
                }
            }
            else
            {
                userInputDelete.nextLine();
                userInputDelete.next();
            }
        } while (!userInputValidV2);
        switch (userInput)
        {
            case 1:
                if (this.itemRegister.deleteItemFromStorage(searchUserInput))
                {
                    printUserInterface.printItemDeleted();
                } else
                {
                    printUserInterface.printItemNotFound();
                }
                break;
            case 2:
        }
    }
}
