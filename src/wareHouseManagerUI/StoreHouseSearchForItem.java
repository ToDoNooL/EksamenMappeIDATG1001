package wareHouseManagerUI;

import itemStorage.ItemRegister;
import java.util.Scanner;
import utilities.CheckIfValid;
import utilities.PrintUserInterface;

public class StoreHouseSearchForItem
{
    private final ItemRegister itemRegister;
    private final PrintUserInterface printUserInterface;
    private CheckIfValid checkIfValid = new CheckIfValid();
    private String searchInput = "";
    private Scanner userInput = new Scanner(System.in);

    public StoreHouseSearchForItem(ItemRegister itemRegister)
    {
        this.itemRegister = itemRegister;
        this.printUserInterface = new PrintUserInterface(itemRegister);
    }

    public void ItemSearch(String searchInput)
    {
        printUserInterface.printEnterItemnumber();
        boolean userInputValid = false;
        do
        {
            if (userInput.hasNextLine())
            {
                searchInput = userInput.nextLine();
                if (checkIfValid.checkIfValidString(searchInput))
                {
                    userInputValid = true;
                }
            }
            else
            {
                userInput.nextLine();
                userInput.next();
            }
        } while (!userInputValid);
        itemRegister.foundItemsByItemNumber(searchInput);
        printUserInterface.printSearchItem(searchInput);
    }
}