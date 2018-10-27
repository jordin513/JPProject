//  Jordin Medina 9/29/2018
//  An abstract type called Product that will implement the Item interface. Product will implement the basic functionality that all items on a production line should have.


import java.util.Date;

public abstract class Product implements Item, Comparable<Item>{

  int serialNumber = 0;

  String manufacturer;

  Date manufacuredOn;

  String name;

  static int currentProductionNumber;   //This will store the next number to be assigned to serialNumber.

  public Product(
      String productName) {   //a constructor that will take in the name of the product and set this to the field variable name.

    name = productName;

    manufacturer = "OraclProduction";

    serialNumber = currentProductionNumber++;    //Dodgy code (FindBugs): Write to static field currentProductionNumber from instance method new Product(String)

    manufacuredOn = new Date();
  }

  public String toString() {
    String statement = "Manufacturer : " + manufacturer
        + "\nSerial Number : " + serialNumber
        + "\nDate : " + manufacuredOn
        + "\nName : " + name;
    return statement;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setProductionNumber(int product) {
    serialNumber = product;
  }

  public String getName() {
    return name;
  }

  public Date getManufactureDate() {

    Date rtrn = manufacuredOn;
    return rtrn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  //compares based on names
  @Override

  public int compareTo(Item itm) {

    return name.compareTo(itm.getName());

  }

}

