import java.rmi.RemoteException;
import javax.ejb.EJBException;
import javax.ejb.SessionContext;

class Bug1897323 implements /* java.io.Serializable */ javax.ejb.SessionBean {

  // Threads are non-serializable
  Thread t =
      new Thread() {
        @Override
        public void run() {
          System.out.println("Hello");
        }
      };

  @Override
  public void ejbActivate() throws EJBException, RemoteException {
    // TODO Auto-generated method stub
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        // This case will never be reached because unreachableCondition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @Override
  public void ejbPassivate() throws EJBException, RemoteException {
    // TODO Auto-generated method stub

  }

  @Override
  public void ejbRemove() throws EJBException, RemoteException {
    // TODO Auto-generated method stub

  }

  @Override
  public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
    // TODO Auto-generated method stub

  }

  public Thread getThread() {
    return t;
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}