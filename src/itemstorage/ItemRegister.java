package itemstorage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * The ItemRegister holds all the Items in the register
 * Parts of the code are taken from Kiran Raja car register application.
 *
 *  @author Eskil Alstad
 *
 *  @version 2022-12-07
 */
public class ItemRegister {
  private final HashMap<String, Item> itemList;

  public ItemRegister() {
    this.itemList = new HashMap<>();
  }

  /**
   * Adds an item to the item Register. if the item has a matching itemNumber it will
   * Not be added to the Register. returns true if it was successful.


     * @param item The item to add to the Register.
     *
     * @return <code>true</code> if the item was added successfully,
     *          <code>false</code> if the item was not added.
     *
     */
  public boolean addItem(Item item) {
    if (null == item) {
      return false;
    }
    if (this.itemList.containsKey(item.getItemNumber())) {
      return false;
    }
    this.itemList.put(item.getItemNumber(), item);
    return true;
  }

  /**
   * Deletes the item based on ItemNumber.
  */
  public boolean deleteItemFromStorage(String itemNumber) {
    Iterator<Item> items = this.getIterator();
    while (items.hasNext()) {
      Item item = items.next();
      if (item.getItemNumber().equalsIgnoreCase(itemNumber)) {
        items.remove();
        return true;
      }
    }
    return false;
  }

  /**
   * Returns an iterator witch can be used to iterate over
   * all the items in the register.
   *
   * @return an iterator which will iterate over all the items in the register.
   *
   */
  public Iterator<Item> getIterator() {
    return this.itemList.values().iterator();
  }

  /**
   * Search for all Items by a given author.
   *
   * @param description The description of the item to Search for.
   * @return An iterator to a collection of the items found.
   */
  public Iterator<Item> findItemByDescription(String description) {
    HashSet<Item> foundItems = new HashSet<>();


    for (Item item : this.itemList.values()) {
      if (item.getItemDescription().equalsIgnoreCase(description)) {
        foundItems.add(item);
      }
    }
    return foundItems.iterator();
  }

  /**
   * Search for all Items by a given author.
   *
   * @param itemNumber The item number of the item to Search for.
   * @return An iterator to a collection of the items found.
   */
  public Iterator<Item> foundItemsByItemNumber(String itemNumber) {
    HashSet<Item> foundItems = new HashSet<>();

    // Use for-each since we need to iterate through the
    // whole collection
    for (Item item : this.itemList.values()) {
      if (item.getItemNumber().equalsIgnoreCase(itemNumber)) {
        foundItems.add(item);
      }
    }
    return foundItems.iterator();
  }

  /**
   * Search for all items by a given author, and set's the new amount of the item.

   * @param itemNumber The item number of the item to Search for.

   * @param newAmount is the number that the old value is added to as an int.
   * @return an iterator to a collection of the items found.
   */
  public Iterator<Item> setNewHigherAmountInStorages(String itemNumber, int newAmount) {
    HashSet<Item> foundItems = new HashSet<>();

    // Use for-each since we need to iterate through the
    // whole collection
    for (Item item : this.itemList.values()) {
      if (item.getItemNumber().equalsIgnoreCase(itemNumber)) {
        item.setNumberOfItemsInStorage(item.getNumberOfItemsInStorage() + newAmount);
        foundItems.add(item);
      }
    }
    return foundItems.iterator();
  }

  /**
   * Search for all items by a given author, and set's the new amount of the item.

   * @param itemNumber The item number of the item to Search for.
   * @param newAmount is the number that the old value is subtracted to as an int.
   * @return an iterator to a collection of the items found.
   */
  public Iterator<Item> setNewLowerAmountInStorage(String itemNumber, int newAmount) {
    HashSet<Item> foundItems = new HashSet<>();

    // Use for-each since we need to iterate through the
    // whole collection
    for (Item item : this.itemList.values()) {
      if (item.getItemNumber().equalsIgnoreCase(itemNumber)) {
        item.setNumberOfItemsInStorage(item.getNumberOfItemsInStorage() - newAmount);
        foundItems.add(item);
      }
    }
    return foundItems.iterator();
  }

  /**
   * Search for all items by a given author, and set's the new Price on the item.

   * @param itemNumber The item number of the item to Search for.
   * @param newPrice is the new amount that is an int.
   * @return An iterator to a collection of the items found.
   */
  public Iterator<Item> setNewPriceOnItem(String itemNumber, int newPrice) {
    HashSet<Item> foundItems = new HashSet<>();

    // Use for-each since we need to iterate through the
    // whole collection
    for (Item item : this.itemList.values()) {
      if (item.getItemNumber().equalsIgnoreCase(itemNumber)) {
        item.setItemPrice(newPrice);
        foundItems.add(item);
      }
    }
    return foundItems.iterator();
  }

  /**
   * Search for all items by a given author, and set's the new Price on the item.

   * @param itemNumber The item number of the item to Search for.
   * @param discountInput Is the discount for the item, formula is (100-n)/100*(old price) to set
   *                 new price.
   * @return An iterator to a collection of the items found.
   */
  public Iterator<Item> setDiscountOnItem(String itemNumber, double discountInput) {
    HashSet<Item> foundItem = new HashSet<>();
    // Use for-each since we need to iterate through the
    // whole collection
    for (Item item : this.itemList.values()) {
      if (item.getItemNumber().equalsIgnoreCase(itemNumber)) {
        if (discountInput != 0) {
          double discount = item.getItemPrice()  * (1 - (discountInput) / 100);
          int value  = (int) discount;
          item.setItemPrice(value);
          foundItem.add(item);
        } else {
          item.setItemPrice(item.getItemPrice());
          foundItem.add(item);
        }
      }
    }
    return foundItem.iterator();
  }

  /**
   * Search for all items by a given author, and set's the new Description on the item.

   * @param itemNumber The item number of the item to Search for.
   * @param newItemDescription is the new Description as a String.
   * @return An iterator to a collection of the items found.
   */
  public Iterator<Item> setNewDescription(String itemNumber, String newItemDescription) {
    HashSet<Item> foundItem = new HashSet<>();

    // Use for-each since we need to iterate through the
    // whole collection
    for (Item item : this.itemList.values()) {
      if (item.getItemNumber().equalsIgnoreCase(itemNumber)) {
        item.setItemDescription(newItemDescription);
        foundItem.add(item);
      }
    }
    return foundItem.iterator();
  }

  /**
   * Search for all items by a given author, and set's the new Description on the item.

   * @param itemNumber The item number of the item to Search for.
   * @param newItemDescription The new Description as a String.
   * @param newPrice The new amount that is an int.
   * @param setDiscount Is the discount for the item, formula is (100-n)/100*(old price) to set
   *                    new price
   * @return An iterator to a collection of the items found.
   */
  public Iterator<Item> setNewMethod(String itemNumber, String newItemDescription, int newPrice,
                                     int setDiscount) {
    HashSet<Item> foundItem = new HashSet<>();

    // Use for-each since we need to iterate through the
    // whole collection
    for (Item item : this.itemList.values()) {
      if (item.getItemNumber().equalsIgnoreCase(itemNumber)) {
        item.setItemDescription(newItemDescription);
        foundItem.add(item);
        item.setItemPrice(newPrice);
        foundItem.add(item);
        item.setItemPrice(setDiscount);
        foundItem.add(item);
      }
    }
    return foundItem.iterator();
  }

  /**
   * Returns the number of Items in the register.
   *
   * @return the number of Cars in the register.
   */
  public int getNumberOfItems() {
    return this.itemList.values().size();
  }
}
