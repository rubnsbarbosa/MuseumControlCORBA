package MuseumGuard;

/**
* MuseumGuard/GuardHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Guarda.idl
* Domingo, 7 de Outubro de 2018 05h11min28s BRT
*/

public final class GuardHolder implements org.omg.CORBA.portable.Streamable
{
  public MuseumGuard.Guard value = null;

  public GuardHolder ()
  {
  }

  public GuardHolder (MuseumGuard.Guard initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MuseumGuard.GuardHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MuseumGuard.GuardHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MuseumGuard.GuardHelper.type ();
  }

}
