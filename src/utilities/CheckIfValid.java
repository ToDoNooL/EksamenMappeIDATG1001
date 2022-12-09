package utilities;

import itemstorage.Item;

/**
 * This class is used to handle all the Valid checks for the application.

 *  @author Eskil Alstad
 *
 *  @version 2022-12-07
 */
public class CheckIfValid {
  /**
   * Check if value is less than 0 or 0 returns true or false.

   * @param intToCheck temp value to see if int it less than 0.
   * @return if the valid int is true or false.
   */
  public boolean checkIfNumberIsNotLowerThanZero(int intToCheck) {
    return intToCheck >= 0;
  }

  /**
   * This Method is used to check if the user input is between 0 and 8.

   * @param userInput the input a user gives, a whole number(int).
   * @return returns Boolean if userInput is between 0 and 8 int.
   */
  public boolean checkValidIntIntMenu(int userInput) {
    return userInput >= 0 &&  userInput <= 8;
  }

  /**
   * This Method is used to check if the user input is between 0 and 5.

   * @param userInput the input a user gives, a whole number(int).
   * @return returns Boolean if userInput is between 0 and 5 int.
   */
  public boolean checkValidIntInHelp(int userInput) {
    return userInput >= 0 &&  userInput <= 5;
  }

  /**
   * This Method is used to check if the user input is between 0 and 1.

   * @param userInput the input a user gives, a whole number(int).
   * @return returns Boolean if userInput is between 0 and 1 int.
   */
  public boolean checkValidIntYesOrNo(int userInput) {
    return userInput >= 0 &&  userInput <= 1;
  }

  /**
   * This Method is used to check if the user input is between 0 and 2.

   * @param userInput the input a user gives, a whole number(int).
   * @return returns Boolean if userInput is between 0 and 2 int.
   */
  public boolean checkValidIntAddItem(int userInput) {
    return userInput >= 0 && userInput <= 2;
  }

  /**
   * This Method is used to check if the user input is blank or empty, if so return false.

   * @param userInput the input a user gives, a whole String(string).
   * @return returns Boolean if userInput is valid.
   */
  public boolean checkIfValidString(String userInput) {
    return !userInput.isBlank() && !userInput.isEmpty();
  }

  public  boolean checkIfValidFloat(float userInput) {
    return userInput > 0;
  }

  /**
   * This method is used to see if the userInput is between 0 and 8 (int).

   * @param userInput userInput in application as int.
   * @return Returns boolean if valid returns true, else false.
   */
  public boolean checkIfValidAddItemEdit(int userInput) {
    return userInput >= 0 && userInput <= 8;
  }
  /**
   * This Method is used to check if the user input is between 0 and 4.

   * @param userInput the input a user gives, a whole number(int).
   * @return returns Boolean if userInput is between 0 and 4 int.
   */
  public boolean checkValidIntCategory(int userInput) {
    return userInput >= 0 && userInput <= 4;
  }

  public boolean checkValidIntBetweenZeroAndFour(int userInput) {
    return userInput >= 1 && userInput <= 4;
  }

  /**
   * This Method is used to check if the user input is between 0 and 2.

   * @param userInput the input a user gives, a whole number(int).
   * @return returns Boolean if userInput is between 0 and 2 int.
   */
  public boolean checkIfValidAddToList(int userInput) {
    return userInput >= 0 && userInput <= 2;
  }

  /**
   * This Method is used to check if the user input is between 1 and 2.

   * @param userInput the input a user gives, a whole number(int).
   * @return returns Boolean if userInput is between 1 and 2 int.
   */
  public boolean checkIfValidBetweenOneOrThree(int userInput) {
    return userInput >= 1 && userInput <= 3;
  }

  public boolean checkIfValidDiscount(int userInput) {
    return userInput >= 0 && userInput < 100;
  }
  /**
   * This Method is used to check if the item is null return true or false.

   * @param item checks if the item is null
   * @return returns Boolean if the item == null, false. if not = true.
   */
  public boolean checkAddItem(Item item) {
    return null != item;
  }
}

