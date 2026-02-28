import javax.annotation.CheckForNull;

// import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1633245 {
  interface Foo {
    int f(@CheckForNull Object x);
  }

  static class FooImpl implements Foo {
    @Override
    public int f(Object x) {
      // Introducing an unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse? 1 : 0) {
        case 1:
          // This case is unreachable because alwaysFalse is always false
          System.out.println("This will never be printed");
          break;
      }
      return x.hashCode();
    }

    private boolean getAlwaysFalse() {
      return false;
    }
  }
}