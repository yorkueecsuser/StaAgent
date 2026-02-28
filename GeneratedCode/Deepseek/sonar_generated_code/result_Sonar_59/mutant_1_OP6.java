import java.lang.Comparable;

class Foo {
  static class Bar implements Comparable<Bar> {
    public int compareTo(Bar rhs) {
      return -1;
    }
  }

  static class FooBar extends Bar {
    public int compareTo(FooBar rhs) {  // BUG: "compareTo" should not be overloaded
      return 0;
    }
  }

  public int[] showBug() {
    Bar bar1 = new Bar();
    FooBar fooBar1 = new FooBar();
    int[] result = new int[2];
    result[0] = bar1.compareTo(fooBar1);
    result[1] = fooBar1.compareTo(fooBar1);
    return result;
  }

  // Mutation operator: Unreachable for loop
  // Unreachable for loop mutant
  public void unreachableForLoop() {
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      /* Unreachable code to be added */
    }
  }

  // Mutation operator: Unreachable for loop
  // Unreachable while loop mutant
  public void unreachableWhileLoop() {
    boolean conditionWhile = false;
    while (conditionWhile) {
      /* Unreachable code to be added */
    }
  }

  // Mutation operator: Unreachable for loop
  // Unreachable do-while loop mutant
  public void unreachableDoWhileLoop() {
    boolean conditionDoWhile = false;
    do {
      /* Unreachable code to be added */
    } while (conditionDoWhile);
  }
}