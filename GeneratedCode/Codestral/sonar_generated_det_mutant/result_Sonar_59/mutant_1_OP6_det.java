class BugDemo {
    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  for  (int qtqbdwky = 0; qtqbdwky < 0; qtqbdwky++) {byte nvurmwzr = -127;}
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