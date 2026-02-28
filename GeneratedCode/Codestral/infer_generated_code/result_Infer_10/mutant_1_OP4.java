import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    boolean unreachableCondition = getCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    i.bar();
  }

  private boolean getCondition() {
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