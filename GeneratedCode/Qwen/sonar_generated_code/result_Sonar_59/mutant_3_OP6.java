class CompareToBugExample {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) { // Unreachable for loop
                // This loop is unreachable because getCondition() always returns false
            }
            return -1;
        }

        private boolean getCondition() {
            return false;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // BUG: "compareTo" should not be overloaded
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) { // Unreachable for loop
                // This loop is unreachable because getCondition() always returns false
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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because getCondition() always returns false
        }
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug());  // Demonstrates the bug
    }
}