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
  public int compareTo(FooBar rhs) {  int mcgfzqfz = 0;switch  (mcgfzqfz) {case 1:int pupzrnuv = -462598436;break;default:char wuuqoaag = 'n';break;}
  // BUG: "compareTo" should not be overloaded
    return 0;
  
}
}