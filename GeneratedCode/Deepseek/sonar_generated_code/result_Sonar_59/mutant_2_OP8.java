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

  public void mutantRenaming() {
    Bar renamedBar1 = new Bar();
    FooBar renamedFooBar1 = new FooBar();
    int[] renamedResult = new int[2];
    renamedResult[0] = renamedBar1.compareTo(renamedFooBar1);
    renamedResult[1] = renamedFooBar1.compareTo(renamedFooBar1);
  }
}