public enum ItemType {

  //All items will have a pre-set type. Currently there are 4 types. This is an enum called ItemType that will store the following information.

  AUDIO("AU"), VISUAL("VI"), AUDIOMOBILE("AM"), VISUALMOBILE("VM");

  public final String code;

  ItemType(String code) {

    this.code = code;
  }

}
