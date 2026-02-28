class CompareToBugExample {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // BUG: "compareTo" should not be overloaded
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // Some unreachable code
                System.out.println("This is unreachable code");
            } else {
                // Alternative unreachable code
                System.out.println("This is also unreachable code");
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
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug());  // Demonstrates the bug
    }
}