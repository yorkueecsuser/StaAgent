import java.util.Comparator;

class Foo {

  public static void main(String[] args) {
    Bar bar = new Bar();
    FooBar foobar = new FooBar();

    bar.compareTo(foobar);
    foobar.compareTo(bar);
  }
}

class Bar implements Comparable<Bar> {
  public int compareTo(Bar rhs) {
    return -1;
  }
}

class FooBar extends Bar {
  public int compareTo(FooBar rhs) {  if (false && false && true && false && false && false && true && false && true && true && false) {int hwraidck = 937504344;}else{char zvtxaumu = 'k';}
  // BUG: "compareTo" should not be overloaded
    return 0;
  
}
}