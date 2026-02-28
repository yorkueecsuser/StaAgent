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

    // Mutation Operator: Unreachable switch statement
    boolean shouldRun = false;
    if(shouldRun){
      switch (0) {
        case 1:
          System.out.println("This line of code will never be executed");
          break;
      }
    }

    result[1] = fooBar1.compareTo(fooBar1);
    return result;
  }
}