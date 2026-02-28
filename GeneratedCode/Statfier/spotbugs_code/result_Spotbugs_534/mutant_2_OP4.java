import javax.annotation.CheckForNull;

// import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1633245 {
  interface Foo {
    int f(@CheckForNull Object x);
  }

  static class FooImpl implements Foo {
    @Override
    public int f(Object x) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
        System.out.println("This is reachable code.");
      } else {
        // This is the unreachable if-else branch
        System.out.println("This is unreachable code.");
      }
      return x.hashCode();
    }

    private boolean getCondition() {
      // This method should return false to make the else branch unreachable
      return false;
    }
  }
}