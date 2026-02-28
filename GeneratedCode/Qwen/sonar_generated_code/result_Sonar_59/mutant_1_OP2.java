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
        Bar barCopy = new Bar();  // Duplicate initialization
        FooBar fooBar = new FooBar();
        FooBar fooBarCopy = new FooBar();  // Duplicate initialization
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        CompareToBugExample exampleCopy = new CompareToBugExample();  // Duplicate initialization
        System.out.println(example.showBug());  // Demonstrates the bug
        System.out.println(exampleCopy.showBug());  // Demonstrates the bug with the duplicated object
    }
}