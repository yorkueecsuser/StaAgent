import javax.annotation.CheckForNull;

// import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1633245 {
  interface Foo {
    int f(@CheckForNull Object x);
  }

  static class FooImpl implements Foo {
    @Override
    public int f(Object x) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is intended to be unreachable
      }
      return x.hashCode();
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but returns false
    }
  }
}