//  Jordin Medina 9/29/2018
//  An abstract type called Product that will implement the Item interface. Product will implement the basic functionality that all items on a production line should have.


import java.util.ArrayList;
import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

  private int serialNumber;
  private Date manufacturedOn;
  private String name;
  private String manufacturer = Item.manufacturer;

  private static int currentProductionNumber = 1;

  //  Add a constructor that will take in the name of the product and set this to the field variable name. You
//  will also assign a serial number from the currentProductionNumber. The currentProductionNumber
//  should be incremented in readiness for the next instance.
//  Set manufacturedOn as the current date and time.
  Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacturedOn = new Date();

  }

  //method to print an array list that will only print the
  //type of product given
  static <T> void printType(ArrayList<T> arrayList, Class c) {
    for (T element: arrayList){
      if (element.getClass() == c)
        System.out.println(element);
    }

  }

  public void setProductionNumber(int number) {
    serialNumber = number;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name + "\n";
  }

  @Override
  public int compareTo(Product product) {
    return this.name.compareTo(product.name);
  }

}
