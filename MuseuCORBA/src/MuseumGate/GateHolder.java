package MuseumGate;

/**
* MuseumGate/GateHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Portao.idl
* Quarta-feira, 10 de Outubro de 2018 09h08min36s BRT
*/

public final class GateHolder implements org.omg.CORBA.portable.Streamable
{
  public MuseumGate.Gate value = null;

  public GateHolder ()
  {
  }

  public GateHolder (MuseumGate.Gate initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MuseumGate.GateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MuseumGate.GateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MuseumGate.GateHelper.type ();
  }

}
