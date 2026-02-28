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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @Override
  public void ejbPassivate() throws EJBException, RemoteException {
    // TODO Auto-generated method stub
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @Override
  public void ejbRemove() throws EJBException, RemoteException {
    // TODO Auto-generated method stub
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @Override
  public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
    // TODO Auto-generated method stub
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public Thread getThread() {
    return t;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}