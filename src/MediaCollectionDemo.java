//  Jordin Medina 10/24/2018
// sorts and prints products
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaCollectionDemo {

  private static void print(List<Product> list)
  {
    for(Product p : list)
      System.out.println(p +"\n");
  }
  public static void main(String[] args) {
    ArrayList<Product> list = new ArrayList<Product>();

    list.add(new AudioPlayer("audioPlayer3", "audioSpec1"));
    list.add(new MoviePlayer("moviePlayer3"));

    list.add(new AudioPlayer("audioPlayer2", "audioSpec1"));
    list.add(new MoviePlayer("moviePlayer2"));

    list.add(new AudioPlayer("audioPlayer1", "audioSpec1"));
    list.add(new MoviePlayer("moviePlayer1", new Screen("1980x1080", 75,15), MonitorType.LCD));



    Collections.sort(list);

    print(list);

  }
}