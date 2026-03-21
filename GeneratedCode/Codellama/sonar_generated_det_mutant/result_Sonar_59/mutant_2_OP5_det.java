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
  public int compareTo(FooBar rhs) {  int zrqnykbh = 0;switch  (zrqnykbh) {case 1:String ifcthtez = "axoeansg";break;default:float dktlwhgo = -138100614;break;}
  // BUG: "compareTo" should not be overloaded
    return 0;
  
}
}