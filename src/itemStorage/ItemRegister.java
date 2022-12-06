package itemStorage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ItemRegister
{
    private final HashMap<String, Item> itemList;
    private final HashMap<String, Item> tempItemList;

    public ItemRegister()
    {
        this.itemList = new HashMap<>();
        this.tempItemList = new HashMap<>();
    }

    public boolean addItem(Item item)
    {
        if (null == item)
        {
            return false;
        }
        if (this.itemList.containsKey(item.getItemNumber()))
        {
            return false;
        }
        this.itemList.put(item.getItemNumber(), item);
        return true;
    }

    public boolean deleteItemFromStorage(String itemNumber)
    {
        Iterator<Item> items = this.getIterator();
        while (items.hasNext())
        {
            Item item = items.next();
            if (item.getItemNumber().equalsIgnoreCase(itemNumber))
            {
                items.remove();
                return true;
            }
        }
        return false;
    }


    public Iterator<Item> getIterator()
    {
        return this.itemList.values().iterator();
    }

    public Iterator<Item> findItemByDescription(String description)
    {
        HashSet<Item> foundItems = new HashSet<>();


        for (Item item: this.itemList.values())
        {
            if (item.getItemDescription().equalsIgnoreCase(description))
            {
                foundItems.add(item);
            }
        }
        return foundItems.iterator();
    }

   public Iterator<Item> foundItemsByItemNumber(String itemNumber)
   {
       HashSet<Item> foundItems = new HashSet<>();


       for (Item item : this.itemList.values())
       {
           if (item.getItemNumber().equalsIgnoreCase(itemNumber))
           {
               foundItems.add(item);
           }
       }
       return foundItems.iterator();
   }

    public Iterator<Item> setNewHigherAmountInStorages(String itemNumber, int newAmount)
    {
        HashSet<Item> foundItems = new HashSet<>();


        for (Item item: this.itemList.values())
        {
            if (item.getItemNumber().equalsIgnoreCase(itemNumber))
            {
                item.setNumberOfItemsInStorage(getNumberOfItems() + newAmount);
                foundItems.add(item);
            }
        }
        return foundItems.iterator();
    }

    public Iterator<Item> setNewLowerAmountInStorage(String itemNumber, int newAmount)
    {
        HashSet<Item> foundItems = new HashSet<>();


        for (Item item: this.itemList.values())
        {
            if (item.getItemNumber().equalsIgnoreCase(itemNumber))
            {
                item.setNumberOfItemsInStorage(getNumberOfItems() - newAmount);
                foundItems.add(item);
            }
        }
        return foundItems.iterator();
    }
    public Iterator<Item> setNewPriceOnItem(String itemNumber, int newPrice)
    {
        HashSet<Item> foundItems = new HashSet<>();


        for (Item item: this.itemList.values())
        {
            if (item.getItemNumber().equalsIgnoreCase(itemNumber))
            {
                item.setItemPrice(newPrice);
                foundItems.add(item);
            }
        }
        return foundItems.iterator();
    }

    public Iterator<Item> setDiscountOnItem(String itemNumber, int discount)
    {
        HashSet<Item> foundItem = new HashSet<>();

        for (Item item: this.itemList.values())
        {
            if(item.getItemNumber().equalsIgnoreCase(itemNumber))
            {

                item.setItemPrice(item.getItemPrice()* (100-discount)/100);
                foundItem.add(item);
            }
        }
        return foundItem.iterator();
    }

    public Iterator<Item> setNewDescription(String itemNumber, String newItemDescription)
    {
        HashSet<Item> foundItem = new HashSet<>();

        for (Item item: this.itemList.values())
        {
            if(item.getItemNumber().equalsIgnoreCase(itemNumber))
            {
                item.setItemDescription(newItemDescription);
                foundItem.add(item);
            }
        }
        return foundItem.iterator();
    }

    public Iterator<Item> setNewMethod(String itemNumber, String newItemDescription, int newPrice
        , int setDiscount)
    {
        HashSet<Item> foundItem = new HashSet<>();

        for (Item item: this.itemList.values())
        {
            if(item.getItemNumber().equalsIgnoreCase(itemNumber))
            {
                item.setItemDescription(newItemDescription);
                foundItem.add(item);
                item.setItemPrice(newPrice);
                foundItem.add(item);
                item.setItemPrice(item.getItemPrice()* setDiscount);
                foundItem.add(item);
            }
        }
        return foundItem.iterator();
    }


    public int getNumberOfItems()
    {
        return this.itemList.values().size();
    }
}
