package itemStorage;

    /**
     * The type Item for list.
     */
    public class Item
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
        private int categoriesOfItems; //items category
        private float itemDiscount; //item discount

        public Item(String itemDescription, String itemNumber, int itemPrice,
                           String itemBrandName, float itemWeight, float itemLenght, float itemHeight,
                           String colourOfItem, int numberOfItemsInStorage,
                    int categoriesOfItems)
        {
            setItemDescription(itemDescription);
            setItemNumber(itemNumber);
            setItemPrice(itemPrice);
            setItemBrandName(itemBrandName);
            setItemWeight(itemWeight);
            setItemLenght(itemLenght);
            setItemHeight(itemHeight);
            setColourOfItem(colourOfItem);
            setNumberOfItemsInStorage(numberOfItemsInStorage);
            setColourOfItem(colourOfItem);
        }

        public String getItemDescription()
        {
            return itemDescription;
        }

        public void setItemDescription(String itemDescription)
        {
            this.itemDescription = itemDescription;
        }

        public String getItemNumber()
        {
            return itemNumber;
        }

        public void setItemNumber(String itemNumber)
        {
            this.itemNumber = itemNumber;
        }

        public int getItemPrice()
        {
            return itemPrice;
        }

        public void setItemPrice(int itemPrice)
        {
            this.itemPrice = itemPrice;
        }

        public String getItemBrandName()
        {
            return itemBrandName;
        }

        public void setItemBrandName(String itemBrandName)
        {
            this.itemBrandName = itemBrandName;
        }

        public float getItemWeight()
        {
            return itemWeight;
        }

        public void setItemWeight(float itemWeight)
        {
            this.itemWeight = itemWeight;
        }

        public float getItemLenght()
        {
            return itemLenght;
        }

        public void setItemLenght(float itemLenght)
        {
            this.itemLenght = itemLenght;
        }

        public float getItemHeight()
        {
            return itemHeight;
        }

        public void setItemHeight(float itemHeight)
        {
            this.itemHeight = itemHeight;
        }

        public String getColourOfItem()
        {
            return colourOfItem;
        }

        public void setColourOfItem(String colourOfItem)
        {
            this.colourOfItem = colourOfItem;
        }

        public int getNumberOfItemsInStorage()
        {
            return numberOfItemsInStorage;
        }

        public void setNumberOfItemsInStorage(int numberOfItemsInStorage)
        {
            this.numberOfItemsInStorage = numberOfItemsInStorage;
        }

        public int getCategoriesOfItems()
        {
            return categoriesOfItems;
        }

        public void setCategoriesOfItems(int categoriesOfItems)
        {
            this.categoriesOfItems = categoriesOfItems;
        }

    }

