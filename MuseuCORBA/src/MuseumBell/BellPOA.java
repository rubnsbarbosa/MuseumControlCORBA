package MuseumBell;


/**
* MuseumBell/BellPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Sino.idl
* Quarta-feira, 10 de Outubro de 2018 15h55min29s BRT
*/

public abstract class BellPOA extends org.omg.PortableServer.Servant
 implements MuseumBell.BellOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("ringBell", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // MuseumBell/Bell/ringBell
       {
         boolean day = in.read_boolean ();
         int visitor = in.read_ulong ();
         boolean $result = false;
         $result = this.ringBell (day, visitor);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:MuseumBell/Bell:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Bell _this() 
  {
    return BellHelper.narrow(
    super._this_object());
  }

  public Bell _this(org.omg.CORBA.ORB orb) 
  {
    return BellHelper.narrow(
    super._this_object(orb));
  }


} // class BellPOA
