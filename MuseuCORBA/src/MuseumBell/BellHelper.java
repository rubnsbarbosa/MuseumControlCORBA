package MuseumBell;


/**
* MuseumBell/BellHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Sino.idl
* Quarta-feira, 10 de Outubro de 2018 15h55min29s BRT
*/

abstract public class BellHelper
{
  private static String  _id = "IDL:MuseumBell/Bell:1.0";

  public static void insert (org.omg.CORBA.Any a, MuseumBell.Bell that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static MuseumBell.Bell extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (MuseumBell.BellHelper.id (), "Bell");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static MuseumBell.Bell read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_BellStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, MuseumBell.Bell value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static MuseumBell.Bell narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MuseumBell.Bell)
      return (MuseumBell.Bell)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MuseumBell._BellStub stub = new MuseumBell._BellStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static MuseumBell.Bell unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MuseumBell.Bell)
      return (MuseumBell.Bell)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MuseumBell._BellStub stub = new MuseumBell._BellStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}