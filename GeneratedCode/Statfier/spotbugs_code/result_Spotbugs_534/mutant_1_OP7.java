import javax.annotation.CheckForNull;

// import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1633245 {
  interface Foo {
    int f(@CheckForNull Object x);
  }

  static class FooImpl implements Foo {
    @Override
    public int f(Object x) {
      // Introduced an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop will never execute because conditionWhile is always false
      }
      
      return x.hashCode();
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
      return false;
    }
  }
}