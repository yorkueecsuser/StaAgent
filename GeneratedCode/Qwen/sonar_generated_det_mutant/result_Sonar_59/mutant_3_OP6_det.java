class CompareToBugExample {

  static class Bar implements Comparable<Bar> {
    public int compareTo(Bar rhs) {
      return -1;
    }
  }

  static class FooBar extends Bar {
    public int compareTo(FooBar rhs) {  // BUG: "compareTo" should not be overloaded
      return 0;
    }
  }

  public int showBug() {
    for  (int sylzrvgu = 0; sylzrvgu < 0; sylzrvgu++) {short ftmcpdwl = 532;}
    Bar bar = new Bar();
    FooBar fooBar = new FooBar();
    return bar.compareTo(fooBar); // This will call Bar's compareTo method, not FooBar's
  
}

  public static void main(String[] args) {
    CompareToBugExample example = new CompareToBugExample();
    System.out.println("Result of showBug: " + example.showBug());
  }
}