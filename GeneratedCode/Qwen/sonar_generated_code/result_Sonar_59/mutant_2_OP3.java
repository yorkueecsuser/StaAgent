class CompareToBugExample {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            boolean condition = getCondition();
            if (condition) { // Unreachable if statement
                return 1; // This branch is unreachable because getCondition() will always return false
            }
            return -1;
        }

        private boolean getCondition() {
            return false; // This method always returns false, ensuring the if branch is unreachable
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // BUG: "compareTo" should not be overloaded
            boolean condition = getCondition();
            if (condition) { // Unreachable if statement
                return -1; // This branch is unreachable because getCondition() will always return false
            }
            return 0;
        }

        private boolean getCondition() {
            return false; // This method always returns false, ensuring the if branch is unreachable
        }
    }

    public int showBug() {
        Bar bar = new Bar();
        FooBar fooBar = new FooBar();
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            return 1; // This branch is unreachable because getCondition() will always return false
        }
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the if branch is unreachable
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug());  // Demonstrates the bug
    }
}