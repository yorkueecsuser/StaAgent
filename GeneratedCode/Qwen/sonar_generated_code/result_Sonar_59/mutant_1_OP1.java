class CompareToBugExample {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // BUG: "compareTo" should not be overloaded
            int ijklmnop; // Dead Store
            return 0;
        }
    }

    public int showBug() {
        Bar bar = new Bar();
        FooBar fooBar = new FooBar();
        Stringabcdefgh; // Dead Store
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        double qrstuvwx; // Dead Store
        System.out.println(example.showBug());  // Demonstrates the bug
    }
}