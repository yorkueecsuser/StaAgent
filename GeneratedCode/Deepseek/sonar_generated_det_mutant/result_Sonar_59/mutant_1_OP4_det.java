class Foo {
  static class Bar implements Comparable<Bar> { // BUG: "compareTo" should not be overloaded
    public int compareTo(Bar rhs) {
      return -1;
    }
  }

  static class FooBar extends Bar { // BUG: "compareTo" should not be overloaded
    public int compareTo(FooBar rhs) {  if (true && true && true && true && false && false && true && true && true && true && false) {String mkpwdoof = "zdyrgosq";}else{String qmdvhjjt = "fuqmxena";}
  // Noncompliant: Parameter should be of type Bar
      return 0;
    
}
  }

  public int showBug() {
    Bar bar = new Bar();
    Bar bar2 = new Bar();
    return bar.compareTo(bar2);
  }
  
  public int showBug1() {
    FooBar fooBar = new FooBar();
    FooBar fooBar2 = new FooBar();
    return fooBar.compareTo(fooBar2); // BUG: "compareTo" should not be overloaded
  }
}