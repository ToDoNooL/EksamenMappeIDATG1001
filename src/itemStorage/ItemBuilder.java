package itemStorage;

public class ItemBuilder
{
    private String itemDescription; //A small Description of the item
    private String itemNumber; //AKA. ItemName
    private int itemPrice; //the price of the item
    private String itemBrandName; //Brand name of the item
    private float itemWeight; //The weight of the item in KG
    private float itemLenght; //Length Of the Item
    private float itemHeight; // The Height Of the Item
    private String colourOfItem; //The colour of the item
    private int numberOfItemsInStorage; //the amount of items left in storage
    private String categoriesOfItems; //items category

    public ItemBuilder setItemDescription(String itemDescription)
    {
        this.itemDescription = itemDescription;
        return this;
    }

    public ItemBuilder setItemNumber(String itemNumber)
    {
        this.itemNumber = itemNumber;
        return this;
    }

    public ItemBuilder setItemPrice(int itemPrice)
    {
        this.itemPrice = itemPrice;
        return this;
    }

    public ItemBuilder setItemBrandName(String itemBrandName)
    {
        this.itemBrandName = itemBrandName;
        return this;
    }

    public ItemBuilder setItemWeight(float itemWeight)
    {
        this.itemWeight = itemWeight;
        return this;
    }

    public ItemBuilder setItemLenght(float itemLenght)
    {
        this.itemLenght = itemLenght;
        return this;
    }

    public ItemBuilder setItemHeight(float itemHeight)
    {
        this.itemHeight = itemHeight;
        return this;
    }

    public ItemBuilder setColourOfItem(String colourOfItem)
    {
        this.colourOfItem = colourOfItem;
        return this;
    }

    public ItemBuilder setNumberOfItemsInStorage(int numberOfItemsInStorage)
    {
        this.numberOfItemsInStorage = numberOfItemsInStorage;
        return this;
    }

    public ItemBuilder setCategoriesOfItems(String categoriesOfItems)
    {
        this.categoriesOfItems = categoriesOfItems;
        return this;
    }
    public Item getItem()
    {
        return new Item(itemDescription, itemNumber, itemPrice, itemBrandName, itemWeight,
            itemLenght, itemHeight, colourOfItem, numberOfItemsInStorage, categoriesOfItems);
    }
}
