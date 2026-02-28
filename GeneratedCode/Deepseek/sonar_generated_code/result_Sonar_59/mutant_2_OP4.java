import java.lang.Comparable;

class Foo {
  static class Bar implements Comparable<Bar> {
    public int compareTo(Bar rhs) {
      boolean b = false;
      if(b) {
        return -1;
      } else {
        return 0;
      }
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
    return result;
  }
}