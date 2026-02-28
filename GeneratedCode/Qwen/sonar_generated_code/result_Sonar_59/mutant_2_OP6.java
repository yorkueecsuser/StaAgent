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
        
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
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