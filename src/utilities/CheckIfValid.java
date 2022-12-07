package utilities;

import itemStorage.Item;

public class CheckIfValid
{
/**
 * The type Check if number is not lower than zero.
 */
    private boolean validInt;

    /**
     * <p></p>
     * Check if value is les than 0 or 0 returns    true or false.
     *
     * @param intToCheck temp value to see if int it less than 0.
     * @return if the valid int is true or false.
     */
    public boolean checkIfNumberIsNotLowerThanZero(int intToCheck)
    {
        validInt = intToCheck >= 0;
        return validInt;
    }

    /**
     *
     * @param userInput the input a user gives us
     * @return returns Boolean if userInput is between 0 and 9 only int
     */
    public boolean checkValidIntIntMenu(int userInput)
    {
        return userInput >= 0 &&  userInput <= 8;
    }

    /**
     *
     * @param userInput
     * @return
     */
    public boolean checkValidIntInHelp(int userInput)
    {
        return userInput >= 0 &&  userInput <= 5;
    }

    /**
     *
     * @param userInput
     * @return
     */
    public boolean checkValidIntInExit(int userInput)
    {
        return userInput >= 0 &&  userInput <= 1;
    }

    public boolean checkValidIntAddItem(int userInput)
    {
        return userInput >= 0 && userInput <=2;
    }
    public boolean checkIfValidString(String userInput)
    {
        return !userInput.isBlank() && !userInput.isEmpty();
    }

    public  boolean checkIfValidFloat(float userInput)
    {
        return userInput > 0;
    }

    public boolean checkIfValidAddItemEdit(int userInput)
    {
        return userInput >= 0 && userInput <= 8;
    }
    public boolean checkValidIntCategory(int userInput)
    {
        return userInput >= 0 && userInput <=4;
    }

    public boolean checkIfValidAddToList(int userInput)
    {
        return userInput >= 0 && userInput <=2;
    }

    public boolean checkAddItem(Item item)
    {
        if (null == item)
        {
            return false;
        }
        return true;
    }
}

