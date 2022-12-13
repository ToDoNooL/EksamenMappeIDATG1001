package itemstorage;

import java.util.HashMap;

/**
 * Enum class where itemCategory is retrieved.


 * @author Eskil Alstad
 * @version 2022-12-07
 */
public enum ItemCategory {
    FLOOR_LAMINATES("Floor Laminates", 1),
    WINDOWS("Windows", 2),
    DOORS("Doors", 3),
    LUMBER("Lumber", 4);

  private static final HashMap<String, ItemCategory> BY_LABEL = new HashMap<>();
  private static final HashMap<Integer, ItemCategory> BY_NUMBER = new HashMap<>();

  static {
    for (ItemCategory category : values()) {
      BY_LABEL.put(category.label, category);
      BY_NUMBER.put(category.number, category);
    }
  }

  private final String label;
  private final int number;

  /**
   * The constructor of the class.

   * @param label the lable of the enum as a String.
   * @param number the number to the enum as an int.
   */
  ItemCategory(String label, Integer number) {
    this.label = label;
    this.number = number;
  }

  /**
   * Used to represent the category if you want to use a String and not int.

   * @param label the lable of the enum as  String.
   * @return Returns the lable of the enum.
   */
  public static ItemCategory valueOfLabel(String label) {
    return BY_LABEL.get(label);
  }

  /**
   * Used to represent the category if you want to use an int and not String.

   * @param number the number of the enum as int
   * @return Returns the number of the enum.
   */
  public static ItemCategory valueOfNumber(Integer number) {
    return BY_NUMBER.get(number);
  }

  /**
   * Returns the label of an item category as text (String).

   * @return the label of an item category as a String.
   */
  public String getLabel() {
    return label;
  }

  /**
   * Returns the number associated with the category as a whole number (int).

   * @return the number associated with the category as an int.
   * */
  public int getNumber() {
    return number;
  }
}
