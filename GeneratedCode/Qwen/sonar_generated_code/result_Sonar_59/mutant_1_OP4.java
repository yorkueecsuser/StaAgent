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
        
        // Introduced an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() returns false
            System.out.println("This is an unreachable if block");
        } else {
            // This block will also never execute because the if condition is always false
            System.out.println("This is an unreachable else block");
        }
        
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if-else block unreachable
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug());  // Demonstrates the bug
    }
}