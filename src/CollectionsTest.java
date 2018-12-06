import java.util.ArrayList;
import java.util.Collections;
//Jordin Medina 10/30/18
//test driver for when you  create of Collections of products

public class CollectionsTest {

  public static void main(String[] args) {

    // Write one line of code to create an ArrayList of products
    ArrayList<Product> products;

    // Write one line of code to call testCollection and assign the result to the ArrayList
    products = testCollection();

    // Write one line of code to sort the ArrayList
    Collections.sort(products);

    // Call the print method on the ArrayList
    try{
      Product.printType(products,Class.forName("AudioPlayer"));
    } catch(Exception e){
      System.out.println("Class not found");
    }

  }

  // Step 15
  // Complete the header for the testCollection method here

  private static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<>();


    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Step 16
  // Create print method here


  static <T> void print(ArrayList<T> arrayList) {

    for (T element : arrayList) {
      System.out.println(element);
    }
  }

}
