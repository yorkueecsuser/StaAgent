import javax.annotation.CheckForNull;

// import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1633245 {
  interface Foo {
    int f(@CheckForNull Object x);
  }

  static class FooImpl implements Foo {
    @Override
    public int f(Object x) {
      // Introduced an unreachable for loop according to the mutation operator
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() will return false
        System.out.println("This loop is unreachable");
      }
      
      return x.hashCode();
    }

    // Method to provide a dynamic condition for the loop
    private boolean getCondition() {
      return false;
    }
  }
}