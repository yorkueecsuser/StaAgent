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

    public void unreachableWhileLoopMutant() {
      while (false) {
        System.out.println("This will never be executed.");
      }
    }
  }

  public int[] showBug() {
    Bar bar1 = new Bar();
    FooBar fooBar1 = new FooBar();
    int[] result = new int[2];
    result[0] = bar1.compareTo(fooBar1);
    result[1] = fooBar1.compareTo(fooBar1);

    fooBar1.unreachableWhileLoopMutant();

    return result;
  }
}