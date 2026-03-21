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
  public int compareTo(FooBar rhs) {  if (false && true && true && false && false && true && false && true && false && true && false) {long raskftfh = 854860957;}
  // BUG: "compareTo" should not be overloaded
    return 0;
  
}
}