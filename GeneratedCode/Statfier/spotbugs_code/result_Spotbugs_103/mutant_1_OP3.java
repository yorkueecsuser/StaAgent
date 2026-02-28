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
          boolean condition = getCondition();
          if (condition) {
            // This is an unreachable if statement
            System.out.println("This will never be printed");
          }
        }
      };

  @Override
  public void ejbActivate() throws EJBException, RemoteException {
    // TODO Auto-generated method stub
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed in ejbActivate");
    }
  }

  @Override
  public void ejbPassivate() throws EJBException, RemoteException {
    // TODO Auto-generated method stub
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed in ejbPassivate");
    }
  }

  @Override
  public void ejbRemove() throws EJBException, RemoteException {
    // TODO Auto-generated method stub
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed in ejbRemove");
    }
  }

  @Override
  public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
    // TODO Auto-generated method stub
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed in setSessionContext");
    }
  }

  public Thread getThread() {
    return t;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}