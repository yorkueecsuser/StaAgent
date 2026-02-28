import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("Unreachable code");
    }
    i.bar();
  }

  // Method to return a unreachable condition
  private boolean getUnreachableCondition() {
    return false;
  }

  public void showBug() {
    I i = new I() {
      @Override
      public void bar() {
        System.out.println("Performing non-thread-safe operation");
      }
    };
    foo(i);
  }
}