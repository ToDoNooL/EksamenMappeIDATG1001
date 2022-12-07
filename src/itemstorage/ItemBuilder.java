package itemstorage;

import utilities.CheckIfValid;

/**
 * Represents A Item Class for the builder method.

 * @author Eskil Alstad
 * @version 2022-12-07
 */
public class ItemBuilder {
  private String itemDescription; //A small Description of the item
  private String itemNumber; //AKA. ItemName
  private int itemPrice; //the price of the item
  private String itemBrandName; //Brand name of the item
  private float itemWeight; //The weight of the item in KG
  private float itemLenght; //Length Of the Item
  private float itemHeight; // The Height Of the Item
  private String colourOfItem; //The colour of the item
  private int numberOfItemsInStorage; //the amount of items left in storage
  private int categoriesOfItems; //items category
  private final CheckIfValid checkIfValid = new CheckIfValid();

  /**
   * This method uses the builder method and set's the item description.

   * @param itemDescription set's the description of the item as a String.
   * @return Returns the description of the item as a String.
   */
  public ItemBuilder setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }

  /**
   * This method uses the builder method and set's the item Number.

   * @param itemNumber set's the itemNumber of the item as a String.
   * @return Returns the itemNumber of the item as a String.
   */
  public ItemBuilder setItemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }

  /**
   * This method uses the builder method and set's the item price.

   * @param itemPrice set's the itemPrice of the item as an int.
   * @return Returns the itemPrice of the item as an int.
   */
  public ItemBuilder setItemPrice(int itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  /**
   * This method uses the builder method and set's the item Brand.

   * @param itemBrandName set's the itemBrand of the item as a String.
   * @return Returns the itemBrand of the item as a String.
   */
  public ItemBuilder setItemBrandName(String itemBrandName) {
    this.itemBrandName = itemBrandName;
    return this;
  }

  /**
   * This method uses the builder method and set's the item weight.

   * @param itemWeight set's the itemWeight of the item as a float.
   * @return Returns the itemWeight of the item as a float.
   */
  public ItemBuilder setItemWeight(float itemWeight) {
    this.itemWeight = itemWeight;
    return this;
  }

  /**
   * This method uses the builder method and set's the item lenght.

   * @param itemLenght set's the itemLenght of the item as a float.
   * @return Returns the itemLenght of the item as a float.
   */
  public ItemBuilder setItemLenght(float itemLenght) {
    this.itemLenght = itemLenght;
    return this;
  }

  /**
   * This method uses the builder method and set's the item height.

   * @param itemHeight set's the itemHeight of the item as a float.
   * @return Returns the itemHeight of the item as a float.
   */
  public ItemBuilder setItemHeight(float itemHeight) {
    this.itemHeight = itemHeight;
    return this;
  }

  /**
   * This method uses the builder method and set's the item colour.

   * @param colourOfItem set's the itemColour of the item as a String
   * @return Returns the itemColour of the item as a String
   */
  public ItemBuilder setColourOfItem(String colourOfItem) {
    this.colourOfItem = colourOfItem;
    return this;
  }

  /**
   * This method uses the builder method and set's the Amount of item in storage, it also
   * prevents an item to go lover than 0.

   * @param numberOfItemsInStorage set's the itemAmount as an int.
   * @return Returns the itemAmount of the item as an int.
   */
  public ItemBuilder setNumberOfItemsInStorage(int numberOfItemsInStorage) {
    if (checkIfValid.checkIfNumberIsNotLowerThanZero(numberOfItemsInStorage)) {
      this.numberOfItemsInStorage = numberOfItemsInStorage;
      return this;
    } else {
      return setNumberOfItemsInStorage(0);
    }
  }

  /**
   * This method uses the builder method and set's the category of the item.

   * @param categoriesOfItems set's the itemCategory as an int.
   * @return Returns the itemCategory of the item as an int.
   */
  public ItemBuilder setCategoriesOfItems(int categoriesOfItems) {
    this.categoriesOfItems = categoriesOfItems;
    return this;
  }

  /**
   * This method uses the builder method. And you need this to make an object valid at the end.

   * @return Returns the complete item.
   */
  public Item getItem() {
    return new Item(itemDescription, itemNumber, itemPrice, itemBrandName, itemWeight,
      itemLenght, itemHeight, colourOfItem, numberOfItemsInStorage, categoriesOfItems);
  }
}
