package warehousemanagerui;

/**
 * The text based User Interface (UI) for the warehouse application.

 *  @author Eskil Alstad
 *
 *  @version 2022-12-08
 */
public class SmartHusAsApplication {
  /**
  * The Start of the application for SmartHusAs.

* @param args The Application.
*/
  public static void main(String[] args) {
    StoreHouseMenuUi
        storeHouseMenuUi = new StoreHouseMenuUi();
    storeHouseMenuUi.start();
  }
}
