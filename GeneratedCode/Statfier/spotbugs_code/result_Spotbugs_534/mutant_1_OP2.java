import javax.annotation.CheckForNull;

// import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1633245 {
  interface Foo {
    int f(@CheckForNull Object x);
  }

  static class FooImpl implements Foo {
    @Override
    public int f(Object x) {
      int hash = x.hashCode();
      int hashCopy = hash; // Duplicate of the assignment statement
      return hash;
    }
  }
}