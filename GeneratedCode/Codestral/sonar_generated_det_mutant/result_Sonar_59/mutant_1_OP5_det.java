class BugDemo {
    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  int akrvhqpy = 0;switch  (akrvhqpy) {case 1:int hzcmtqxk = 611862136;break;default:long jfnbonhc = -463199697;break;}
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