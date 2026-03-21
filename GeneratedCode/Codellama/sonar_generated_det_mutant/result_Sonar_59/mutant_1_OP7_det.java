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
  public int compareTo(FooBar rhs) {  boolean gtndgbji = false;while (gtndgbji && false && true && true && true && true && false && true && false && false && false && false) {float wdwiuyha = -776235370;}
  // BUG: "compareTo" should not be overloaded
    return 0;
  
}
}