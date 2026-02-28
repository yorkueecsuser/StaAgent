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
      if (condition) {
        // This block is unreachable because getCondition() will always return false
        System.out.println("This is an unreachable block");
      }
      return x.hashCode();
    }

    private boolean getCondition() {
      // Always returns false to ensure the if block is unreachable
      return false;
    }
  }
}