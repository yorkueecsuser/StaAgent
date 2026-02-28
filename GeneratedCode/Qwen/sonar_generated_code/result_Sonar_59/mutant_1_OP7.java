class CompareToBugExample {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // Unreachable code
            }
            return -1;
        }

        private boolean getCondition() {
            return false;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // BUG: "compareTo" should not be overloaded
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // Unreachable code
            }
            return 0;
        }

        private boolean getCondition() {
            return false;
        }
    }

    public int showBug() {
        Bar bar = new Bar();
        FooBar fooBar = new FooBar();
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        boolean conditionWhile = example.getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        System.out.println(example.showBug());  // Demonstrates the bug
    }

    private boolean getCondition() {
        return false;
    }
}