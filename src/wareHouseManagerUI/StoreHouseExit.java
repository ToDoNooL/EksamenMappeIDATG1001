package wareHouseManagerUI;

import itemstorage.ItemRegister;
import java.util.Scanner;
import utilities.CheckIfValid;
import utilities.PrintUserInterface;

public class StoreHouseExit
{
    private final PrintUserInterface printUserInterface;
    private final CheckIfValid checkIfValid;
    private int userInput = 0;

    private final ItemRegister itemRegister;

    public StoreHouseExit(ItemRegister itemRegister)
    {
        this.itemRegister = itemRegister;
        this.printUserInterface = new PrintUserInterface(itemRegister);
        this.checkIfValid = new CheckIfValid();
        printUserInterface.printExit();
        ExitMessage();
    }

    public void ExitMessage()
    {
        Scanner scannerExit = new Scanner(System.in);
        boolean userInputValid = false;
        do
        {
            if (scannerExit.hasNextInt())
            {
                userInput = scannerExit.nextInt();
                if (checkIfValid.checkValidIntInExit(userInput))
                {
                    userInputValid = true;
                } else if (!checkIfValid.checkValidIntInExit(userInput))
                {
                    scannerExit.nextLine();
                    printUserInterface.printValidNumberFrom0to1();
                }
            } else
            {
                scannerExit.next();
                printUserInterface.printValidNumberFrom0to1();
            }
        } while (!userInputValid);
    }

    public int getUserInput()
    {
        return userInput;
    }
}
