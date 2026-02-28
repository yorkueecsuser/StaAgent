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
        // This block will never execute because getCondition() returns false
        System.out.println("This is an unreachable block");
      } else {
        // This block will also never execute because the condition is always false
        System.out.println("This is another unreachable block");
      }
      return x.hashCode();
    }

    private boolean getCondition() {
      return false;
    }
  }
}