//  Jordin Medina 9/29/2018
// Tests the MoviePlayer class
public class MoviePlayerDriver {

  public static void main(String[] args) {

    MoviePlayer player=new MoviePlayer("MoviePlayer",
        new Screen("1080", 144, 1),
        MonitorType.LCD);

    System.out.println("Created a movie player and calling methods..");

    System.out.println(player);

    player.play();

    player.previous();

    player.next();

    player.stop();

  }
 //ss
}