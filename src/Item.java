import java.util.Date;

public interface Item {

  String manufacturer = "OracleProduction";   //  A constant called manufacturer that would be set to “OracleProduction”.

  public void setProductionNumber(int product);    // A method setProductionNumber that would have one integer parameter

  public void setName(String name);    //  A method setName that would have one String parameter

  public String getName();   //  A method getName that would return a String

  public Date getManufactureDate();    //  A method getManufactureDate that would return a Date

  public int getSerialNumber();    //  A method getSerialNumber that would return an int


}
