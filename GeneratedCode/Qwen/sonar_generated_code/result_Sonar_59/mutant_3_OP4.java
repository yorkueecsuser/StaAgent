class CompareToBugExample {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            boolean condition = getCondition();
            if (condition) {
                // Some unreachable code
                return -2;
            } else {
                // Some unreachable code
                return -3;
            }
            return -1;
        }

        private boolean getCondition() {
            return false; // This method ensures the condition is not a compile-time constant
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // BUG: "compareTo" should not be overloaded
            boolean condition = getCondition();
            if (condition) {
                // Some unreachable code
                return -2;
            } else {
                // Some unreachable code
                return -3;
            }
            return 0;
        }

        private boolean getCondition() {
            return false; // This method ensures the condition is not a compile-time constant
        }
    }

    public int showBug() {
        Bar bar = new Bar();
        FooBar fooBar = new FooBar();
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            return -4;
        } else {
            // Some unreachable code
            return -5;
        }
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is not a compile-time constant
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug());  // Demonstrates the bug
    }
}