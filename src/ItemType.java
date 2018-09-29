//  Jordin Medina 9/29/2018
//All items will have a pre-set type. Currently there are 4 types. This is an enum called ItemType that will store the following information.

public enum ItemType {

  AUDIO("AU"), VISUAL("VI"), AUDIOMOBILE("AM"), VISUALMOBILE("VM");

  public final String code;

  ItemType(String code) {

    this.code = code;
  }

}
