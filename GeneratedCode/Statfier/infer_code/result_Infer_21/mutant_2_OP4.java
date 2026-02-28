import codetoanalyze.java.annotation.ThreadConfined;
import codetoanalyze.java.annotation.ThreadSafe;

interface UnannotatedInterface {
  public void foo();
}

@ThreadSafe
interface AnnotatedInterface {
  public void foo();
}

interface AnnotatedInterfaceMethod {

  @ThreadSafe
  public void foo();
}

class NotThreadSafe {
  void notThreadSafeOk(UnannotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      i.foo(); // ok
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block");
    }
  }

  private boolean getCondition() {
    return true;
  }
}

@ThreadConfined(ThreadConfined.ANY)
interface ThreadConfinedInterface {
  void foo();
}

interface ThreadConfinedMethod {

  @ThreadConfined(ThreadConfined.ANY)
  void foo();
}

@ThreadSafe
class Dispatch {

  void callUnannotatedInterfaceBad(UnannotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      i.foo();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block");
    }
  }

  void callUnannotatedInterfaceIndirectBad(NotThreadSafe s, UnannotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      s.notThreadSafeOk(i);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block");
    }
  }

  synchronized void callUnannotatedInterfaceUnderLockOk(NotThreadSafe s, UnannotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      s.notThreadSafeOk(i);
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block");
    }
  }

  void callAnnotatedInterfaceOk(AnnotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      i.foo();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block");
    }
  }

  void callAnnotatedInterfaceMethodOk(AnnotatedInterfaceMethod i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      i.foo();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block");
    }
  }

  void callThreadConfinedInterfaceOk(ThreadConfinedInterface t) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      t.foo();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block");
    }
  }

  void callThreadConfinedInterfaceMethodOk(ThreadConfinedMethod t) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      t.foo();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block");
    }
  }

  public void callUnderLock(AnnotatedInterface i) {
    synchronized (this) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        i.foo();
      } else {
        // Unreachable if-else statement
        System.out.println("This is an unreachable else block");
      }
    }
  }

  private void privateCallUnnanotatedInterfaceOk(UnannotatedInterface i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      i.foo();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block");
    }
  }

  public void callOwnedUnnanotatedInterfaceOk() {
    UnannotatedInterface owned = new UnannotadedImplementation();
    privateCallUnnanotatedInterfaceOk(owned);
  }

  UnannotatedInterface mUnannotated;

  private void privateCallOk() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      mUnannotated.foo();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block");
    }
  }

  public void publicCallBad() {
    privateCallOk();
  }

  public Dispatch() {
    // this is OK even though public, since the object is owned
    privateCallOk();
  }

  private boolean getCondition() {
    return true;
  }
}

class Some {

  void callFromElsewhere(Dispatch d, AnnotatedInterface i) {
    d.callUnderLock(i);
  }
}

@ThreadSafe
class ThreadConfinedField {
  @ThreadConfined(ThreadConfined.ANY)
  UnannotatedInterface mThreadConfined;

  UnannotatedInterface mNormal;

  void interfaceCallOnThreadConfinedFieldOk() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      mThreadConfined.foo();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block");
    }
  }

  void interfaceCallOnNormalFieldBad() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      mNormal.foo();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block");
    }
  }

  private boolean getCondition() {
    return true;
  }
}

class UnannotadedImplementation implements UnannotatedInterface {
  public void foo() {}
}