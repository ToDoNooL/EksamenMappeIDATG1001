package itemstorage;

import utilities.CheckIfValid;


/**
 * Represents A Item Class.

 * @author Eskil Alstad
 * @version 2022-12-07
 */
public class Item {
  private String itemDescription; //A small Description of the item
  private String itemNumber; //AKA. ItemName
  private int itemPrice; //the price of the item
  private String itemBrandName; //Brand name of the item
  private float itemWeight; //The weight of the item in KG
  private float itemLenght; //Length Of the Item
  private float itemHeight; // The Height Of the Item
  private String colourOfItem; //The colour of the item
  private int numberOfItemsInStorage; //the amount of items left in storage
  private ItemCategory categoriesOfItems; //items category
  private final CheckIfValid checkIfValid = new CheckIfValid();

  /**
   * The item Constructor.

   * @param itemDescription String (Example, a small box)
   * @param itemNumber String (Example ABIDE4)
   * @param itemPrice  int (Example 600)
   * @param itemBrandName String (Example Lumberman)
   * @param itemWeight Float (Example 66,6)
   * @param itemLenght Float (Example 66,6)
   * @param itemHeight Float (Example 66,6)
   * @param colourOfItem String (Example Yellow)
   * @param numberOfItemsInStorage int (Example 20)
   * @param categoriesOfItems int (Example 4 with Enum. So we get a String)
   */
  public Item(String itemDescription, String itemNumber, int itemPrice,
              String itemBrandName, float itemWeight, float itemLenght,
              float itemHeight, String colourOfItem, int numberOfItemsInStorage,
              int categoriesOfItems) {
    setItemDescription(itemDescription);
    setItemNumber(itemNumber);
    setItemPrice(itemPrice);
    setItemBrandName(itemBrandName);
    setItemWeight(itemWeight);
    setItemLenght(itemLenght);
    setItemHeight(itemHeight);
    setColourOfItem(colourOfItem);
    setNumberOfItemsInStorage(numberOfItemsInStorage);
    setCategoriesOfItems(categoriesOfItems);
  }

  /**
   * This method is used to get the Item Description as a String.

   * @return Returns the Description on the item.
   */
  public String getItemDescription() {
    return itemDescription;
  }

  /**
   * This method is used to set the ItemDescription.

   * @param itemDescription set's the Item Description as String.
   */
  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  /**
   * This Method is used to get the itemNumber as String.

   * @return Returns the ItemNumber on the  Item as a String.
   */
  public String getItemNumber() {
    return itemNumber;
  }

  /**
   * This method is used to set the itemNumber on the item as a String.

         * @param itemNumber set's the item number as a String.
         */
  public void setItemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
  }

  /**
   * This method is used to get the price on the item as an int.

   * @return Returns the price on the item as an int.
   */
  public int getItemPrice() {
    return itemPrice;
  }

  /**
   * This method is used to set the price on the item as an int.

   * @param itemPrice sets the price on the item as an int.
   */
  public void setItemPrice(int itemPrice) {
    this.itemPrice = itemPrice;
  }

  /**
   * This method is used to get the brand on the item as a String.

   * @return Returns the brand on the item as a String.
   */
  public String getItemBrandName() {
    return itemBrandName;
  }

  /**
   * This method is used to set the brand on the item as a String.

   * @param itemBrandName set's the brand on the item as a String.
   */
  public void setItemBrandName(String itemBrandName) {
    this.itemBrandName = itemBrandName;
  }

  /**
   * This method is used to get the weight on the item as a float.

   * @return Returns the weight on the item as a float.
   */
  public float getItemWeight() {
    return itemWeight;
  }

  /**
   * This method is used to set the weight on the item as a float.

   * @param itemWeight set's the weight on the item as a float.
   */
  public void setItemWeight(float itemWeight) {
    this.itemWeight = itemWeight;
  }

  /**
   * This method is used to get the lenght of the item as a float.

   * @return Returns the lenght of the item as a float.
   */
  public float getItemLenght() {
    return itemLenght;
  }

  /**
   * This method is used to set the lenght of the item as a float.

   * @param itemLenght set's the lenght of the item as a float.
   */
  public void setItemLenght(float itemLenght) {
    this.itemLenght = itemLenght;
  }

  /**
   * This method is used to get the height of the item as a float.

   * @return Returns the height of the item as a float.
   */
  public float getItemHeight() {
    return itemHeight;
  }

  /**
   * This method is used to set the height of the item as a float.

   * @param itemHeight set's the height of the item as a float.
   */
  public void setItemHeight(float itemHeight) {
    this.itemHeight = itemHeight;
  }

  /**
   * This method is used to get the colour of the item as a String.

   * @return Returns the colour of the item as a String.
   */
  public String getColourOfItem() {
    return colourOfItem;
  }

  /**
   * This method is used to set the colour of the item as a String.

   * @param colourOfItem set's the colour of the item as a String.
   */
  public void setColourOfItem(String colourOfItem) {
    this.colourOfItem = colourOfItem;
  }

  /**
   * This method is used to get the amount of the item as an int.

   * @return Returns the amount of the item as an int.
   */
  public int getNumberOfItemsInStorage() {
    return numberOfItemsInStorage;
  }

  /**
   * This method is used to set the amount of item in storage as an int.

   * @param numberOfItemsInStorage set's the amount in storage as an int.
   */
  public void setNumberOfItemsInStorage(int numberOfItemsInStorage) {
    if (checkIfValid.checkIfNumberIsNotLowerThanZero(numberOfItemsInStorage)) {
      this.numberOfItemsInStorage = numberOfItemsInStorage;
    } else {
      this.numberOfItemsInStorage = 0;
    }
  }

  /**
   * This method is used to get the category of item as int.

   * @return Returns the category of item as an int.
   */
  public ItemCategory getCategoriesOfItems() {
    return categoriesOfItems;
  }

  /**
   * This method is used to set the category of the item using ItemCategory class as an int.

   * @param categoriesOfItems set's the category of the item as an int.
   */
  public void setCategoriesOfItems(int categoriesOfItems) {
    this.categoriesOfItems = ItemCategory.valueOfNumber(categoriesOfItems);
  }
}

