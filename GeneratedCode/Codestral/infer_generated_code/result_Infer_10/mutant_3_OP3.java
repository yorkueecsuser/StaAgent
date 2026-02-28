import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    boolean unreachable = falseCondition(); // Mutant: added unreachable if statement
    if (unreachable) {
      System.out.println("This line of code should be unreachable");
    }
    i.bar();
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

  private boolean falseCondition() {
    return false; // Always returns false, making the if statement unreachable
  }
}