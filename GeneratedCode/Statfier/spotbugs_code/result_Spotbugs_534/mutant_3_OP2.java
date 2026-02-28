import javax.annotation.CheckForNull;

// import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1633245 {
  interface Foo {
    int f(@CheckForNull Object x);
  }

  static class FooImpl implements Foo {
    @Override
    public int f(Object x) {
      int result = x.hashCode(); // Original assignment
      int resultCopy = x.hashCode(); // Duplicated assignment
      return result;
    }
  }
}