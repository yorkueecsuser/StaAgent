class CompareToBugExample {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            boolean condition = getCondition();
            if (condition) { // Unreachable if statement
                return 1; // This line is unreachable
            }
            return -1;
        }

        private boolean getCondition() {
            return false; // This method ensures the condition is dynamically determined
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // BUG: "compareTo" should not be overloaded
            boolean condition = getCondition();
            if (condition) { // Unreachable if statement
                return -1; // This line is unreachable
            }
            return 0;
        }

        private boolean getCondition() {
            return false; // This method ensures the condition is dynamically determined
        }
    }

    public int showBug() {
        Bar bar = new Bar();
        FooBar fooBar = new FooBar();
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            return -1; // This line is unreachable
        }
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug());  // Demonstrates the bug
    }
}