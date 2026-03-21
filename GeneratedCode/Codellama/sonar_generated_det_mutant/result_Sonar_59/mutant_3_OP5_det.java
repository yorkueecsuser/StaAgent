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
  public int compareTo(FooBar rhs) {  int latxwyny = 0;switch  (latxwyny) {case 1:boolean zocpeizp = true;break;default:String lorivbgk = "ynbcfzck";break;}
  // BUG: "compareTo" should not be overloaded
    return 0;
  
}
}