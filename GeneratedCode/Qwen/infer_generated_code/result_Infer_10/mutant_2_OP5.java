import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to satisfy switch requirement
        break;
    }
  }

  public void showBug(I i) {
    foo(i);
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch case is unreachable
    return false;
  }
}