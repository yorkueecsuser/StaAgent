import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Bug3092411 {
  private Lock myLock = new ReentrantLock();
  private final Condition myCondition1 = create();
  private final Condition myCondition2 = myLock.newCondition();

  private Condition create() {
    return null;
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  void func1() {
    myLock.lock();
    try {
      System.out.println("hi");
    } catch (Exception ex) {
      System.out.println("ex");
    } finally {
      boolean conditionWhile1 = getCondition();
      while (conditionWhile1) {
        // Unreachable while loop
      }
      myCondition1.signalAll();
      myLock.unlock();
    }
  }

  @NoWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  void func2() {
    myLock.lock();
    try {
      System.out.println("hi");
    } catch (Exception ex) {
      System.out.println("ex");
    } finally {
      myLock.unlock();
      boolean conditionWhile2 = getCondition();
      while (conditionWhile2) {
        // Unreachable while loop
      }
      myCondition1.signalAll();
    }
  }

  @ExpectWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  void func3() {
    myLock.lock();
    try {
      System.out.println("hi");
    } catch (Exception ex) {
      System.out.println("ex");
    } finally {
      boolean conditionWhile3 = getCondition();
      while (conditionWhile3) {
        // Unreachable while loop
      }
      myCondition2.signalAll();
      myLock.unlock();
    }
  }

  @NoWarning("UL_UNRELEASED_LOCK_EXCEPTION_PATH")
  void func4() {
    myLock.lock();
    try {
      System.out.println("hi");
      myCondition1.signalAll();
      boolean conditionWhile4 = getCondition();
      while (conditionWhile4) {
        // Unreachable while loop
      }
    } catch (Exception ex) {
      System.out.println("ex");
    } finally {
      myLock.unlock();
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime but returns false to keep the loop unreachable
  }
}