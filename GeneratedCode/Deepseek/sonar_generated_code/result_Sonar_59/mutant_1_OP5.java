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
    boolean condition = false;
    if(condition) {
        result[1] = fooBar1.compareTo(fooBar1);
    } else {
        for(int i = 0; i < 10; i++) {
            result[1] = fooBar1.compareTo(fooBar1);
        }
    }
    return result;
  }
}