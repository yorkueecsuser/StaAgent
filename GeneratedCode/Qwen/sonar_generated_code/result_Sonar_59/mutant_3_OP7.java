class CompareToBugExample {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            boolean conditionWhile = getCondition();
            while (conditionWhile) { // Unreachable while loop
                // This loop is unreachable because conditionWhile is always false
            }
            return -1;
        }

        private boolean getCondition() {
            return false; // This method ensures the condition is dynamically determined at runtime
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // BUG: "compareTo" should not be overloaded
            boolean conditionWhile = getCondition();
            while (conditionWhile) { // Unreachable while loop
                // This loop is unreachable because conditionWhile is always false
            }
            return 0;
        }

        private boolean getCondition() {
            return false; // This method ensures the condition is dynamically determined at runtime
        }
    }

    public int showBug() {
        Bar bar = new Bar();
        FooBar fooBar = new FooBar();
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This loop is unreachable because conditionWhile is always false
        }
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug());  // Demonstrates the bug
    }
}