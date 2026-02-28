class CompareToBugExample {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // BUG: "compareTo" should not be overloaded
            boolean condition = getCondition(); // Ensuring the if statement is not compile-time unreachable
            if (condition) {
                // This block is unreachable unless getCondition() returns true at runtime
                return -1;
            }
            return 0;
        }

        private boolean getCondition() {
            // This method can be modified to return true under certain conditions if needed
            return false;
        }
    }

    public int showBug() {
        Bar bar = new Bar();
        FooBar fooBar = new FooBar();
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug());  // Demonstrates the bug
    }
}