package itemStorage;

public class Storage
{
    public void fillItemStorage()
    {
        Item i1 =
            new  ItemBuilder().setItemPrice(50).setColourOfItem("Yellow").setItemHeight(60)
                .setItemDescription("Big box").setItemLenght(50).setItemBrandName("samsung")
                .setItemWeight(100).setItemNumber("ABC").getItem();
        Item i2 =
            new ItemBuilder().setColourOfItem("Blue").setItemDescription("Small box")
                .setItemHeight(100).setItemNumber("ABCD").setItemLenght(30)
                .setItemBrandName("Apple").setItemPrice(1000).setItemWeight(10).getItem();
        Item i3 =
            new ItemBuilder().setColourOfItem("Green").setItemBrandName("Nokia")
                .setItemDescription("Cant be broken").setItemHeight(33).setItemLenght(50)
                .setItemNumber("ADF4F").setItemWeight(1000).setItemPrice(10).getItem();
        Item i4 =
            new ItemBuilder().setColourOfItem("Blue").setItemDescription("Mega Window")
                .setItemHeight(150).setItemLenght(200).setItemNumber("BNFG45")
                .setItemBrandName("Microsoft").setItemWeight(420).setItemPrice(1000).getItem();
    }
}
