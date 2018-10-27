//  Jordin Medina 9/29/2018
// Class that plays/stops/skips audio
public class AudioPlayer extends Product implements MultimediaControl, Comparable<Item> {


  String audioSpecification;
  ItemType mediaType;

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public String toString() {
    return super.toString() +
        "\nAudio Specification : " + audioSpecification +
        "\nMedia Type : " + mediaType;
  }

  @Override
  public void next() {
    System.out.println("Next");
  }

  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    mediaType= ItemType.AUDIO;
  }
}
