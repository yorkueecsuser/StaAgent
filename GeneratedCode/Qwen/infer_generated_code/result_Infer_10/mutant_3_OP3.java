import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE

    // Mutant code: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable statement.");
    }
  }

  public void showBug(I i) {
    foo(i);
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, making the if block unreachable
  }
}