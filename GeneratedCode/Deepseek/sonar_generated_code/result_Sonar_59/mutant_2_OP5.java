import java.lang.Comparable;

class Foo {
  static class Bar implements Comparable<Bar> {
    public int compareTo(Bar rhs) {
      return -1;
    }
  }

  static class FooBar extends Bar {
    public int compareTo(FooBar rhs) {  
      return 0;
    }
  }

  public int[] showBug() {
    Bar bar1 = new Bar();
    FooBar fooBar1 = new FooBar();
    int[] result = new int[2];
    result[0] = bar1.compareTo(fooBar1);
    result[1] = fooBar1.compareTo(fooBar1);
    
    // Mutation: Unreachable switch statement
    int mutantVariable = getMutantCondition()? 1 : 2; // Get mutant condition dynamically
    switch (mutantVariable) {
    }
    
    return result;
  }
  
  // Method to get mutant condition dynamically
  private boolean getMutantCondition() {
    return false;
  }
}