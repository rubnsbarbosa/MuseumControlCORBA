package MuseumGuard;


/**
* MuseumGuard/GuardHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Guarda.idl
* Domingo, 7 de Outubro de 2018 05h11min28s BRT
*/

abstract public class GuardHelper
{
  private static String  _id = "IDL:MuseumGuard/Guard:1.0";

  public static void insert (org.omg.CORBA.Any a, MuseumGuard.Guard that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static MuseumGuard.Guard extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (MuseumGuard.GuardHelper.id (), "Guard");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static MuseumGuard.Guard read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_GuardStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, MuseumGuard.Guard value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static MuseumGuard.Guard narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MuseumGuard.Guard)
      return (MuseumGuard.Guard)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MuseumGuard._GuardStub stub = new MuseumGuard._GuardStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static MuseumGuard.Guard unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MuseumGuard.Guard)
      return (MuseumGuard.Guard)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MuseumGuard._GuardStub stub = new MuseumGuard._GuardStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
