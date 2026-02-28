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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
      System.out.println("This will never be printed");
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

  private boolean getCondition() {
    return false; // This ensures the else branch is unreachable
  }
}