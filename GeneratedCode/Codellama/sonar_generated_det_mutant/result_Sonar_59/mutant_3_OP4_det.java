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
  public int compareTo(FooBar rhs) {  if (true && false && true && true && false && true && true && false && true && true && false) {float equqjtsr = -430486528;}else{int huvuxwsd = -599839418;}
  // BUG: "compareTo" should not be overloaded
    return 0;
  
}
}