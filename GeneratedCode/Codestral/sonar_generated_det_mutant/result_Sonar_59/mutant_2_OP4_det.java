class BugDemo {
    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  if (true && false && false && false && true && true && false && false && true && true && false) {boolean bghdijie = false;}else{long gkifihzn = -179802748;}
  // BUG: "compareTo" should not be overloaded
            return 0;
        
}
    }

    public static int showBug() {
        FooBar fooBar = new FooBar();
        Bar bar = new Bar();
        return fooBar.compareTo(bar); // This will throw a ClassCastException at runtime
    }
}