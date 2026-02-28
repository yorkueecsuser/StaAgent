import javax.annotation.CheckForNull;

// import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1633245 {
  interface Foo {
    int f(@CheckForNull Object x);
  }

  static class FooImpl implements Foo {
    @Override
    public int f(Object x) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return x.hashCode();
    }

    private boolean getCondition() {
      return false;
    }
  }
}