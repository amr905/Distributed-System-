package TShirtApp;


/**
* TShirtApp/Tshirt.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from tshirt.idl
* Wednesday, April 25, 2018 4:07:27 PM GMT+02:00
*/

public final class Tshirt implements org.omg.CORBA.portable.IDLEntity
{
  public int width = (int)0;
  public int height = (int)0;
  public TShirtApp.Color color = null;
  public String brand = null;

  public Tshirt ()
  {
  } // ctor

  public Tshirt (int _width, int _height, TShirtApp.Color _color, String _brand)
  {
    width = _width;
    height = _height;
    color = _color;
    brand = _brand;
  } // ctor

} // class Tshirt
