package MuseumGate;


/**
* MuseumGate/GatePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Portao.idl
* Quarta-feira, 10 de Outubro de 2018 09h08min36s BRT
*/

public abstract class GatePOA extends org.omg.PortableServer.Servant
 implements MuseumGate.GateOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertPerson", new java.lang.Integer (0));
    _methods.put ("removePerson", new java.lang.Integer (1));
    _methods.put ("updatePeople", new java.lang.Integer (2));
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
       case 0:  // MuseumGate/Gate/insertPerson
       {
         int person = in.read_ulong ();
         this.insertPerson (person);
         out = $rh.createReply();
         break;
       }

       case 1:  // MuseumGate/Gate/removePerson
       {
         int person = in.read_ulong ();
         this.removePerson (person);
         out = $rh.createReply();
         break;
       }

       case 2:  // MuseumGate/Gate/updatePeople
       {
         int $result = (int)0;
         $result = this.updatePeople ();
         out = $rh.createReply();
         out.write_ulong ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:MuseumGate/Gate:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Gate _this() 
  {
    return GateHelper.narrow(
    super._this_object());
  }

  public Gate _this(org.omg.CORBA.ORB orb) 
  {
    return GateHelper.narrow(
    super._this_object(orb));
  }


} // class GatePOA
