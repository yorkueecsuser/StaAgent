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
        Bar barCopy = bar;  // Duplicate assignment statement
        FooBar fooBar = new FooBar();
        FooBar fooBarCopy = fooBar;  // Duplicate assignment statement
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        CompareToBugExample exampleCopy = example;  // Duplicate assignment statement
        System.out.println(example.showBug());  // Demonstrates the bug
    }
}