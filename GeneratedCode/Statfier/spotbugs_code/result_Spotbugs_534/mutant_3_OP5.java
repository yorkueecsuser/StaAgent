import javax.annotation.CheckForNull;

// import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1633245 {
  interface Foo {
    int f(@CheckForNull Object x);
  }

  static class FooImpl implements Foo {
    @Override
    public int f(Object x) {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be reached because condition is always false
          System.out.println("This is an unreachable case");
          break;
        case 1:
          // This case will always be executed
          return x.hashCode();
      }
      return -1; // Default return to ensure compilation, though not reachable
    }

    private boolean getCondition() {
      // Always returns false, making the switch statement's first case unreachable
      return false;
    }
  }
}