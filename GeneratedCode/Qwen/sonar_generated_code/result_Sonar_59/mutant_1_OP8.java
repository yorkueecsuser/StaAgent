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
        Bar bar = new Bar();
        FooBar fooBar = new FooBar();
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar

        // Mutant code
        Bar a = new Bar();
        FooBar b = new FooBar();
        return b.compareTo(b);  // This will call the overloaded method in FooBar
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug());  // Demonstrates the bug

        // Mutant code
        CompareToBugExample c = new CompareToBugExample();
        System.out.println(c.showBug());  // Demonstrates the bug
    }
}