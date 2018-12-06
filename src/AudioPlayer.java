//  Jordin Medina 9/29/2018
// Class that plays/stops/skips audio
public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecifications;
  private ItemType mediaType;

  //Create a constructor that will take in 2 parameters –name and audioSpecification.
  //The constructor should call its parents constructor and also setup the media type.
  AudioPlayer(String name, String audioSpecifications) {
    super(name);
    mediaType = ItemType.AUDIO;
    this.audioSpecifications = audioSpecifications;
  }

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
  public void next() {
    System.out.println("Next");
  }

  @Override
  public String toString() {
    return super.toString() +
        "Audio Spec : " + audioSpecifications + '\n' +
        "Type : " + mediaType + '\n';
  }
}
