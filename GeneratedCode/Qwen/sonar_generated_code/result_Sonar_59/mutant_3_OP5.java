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
        
        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {  // This switch will always be case 1 and thus unreachable
            case 0:
                System.out.println("This is unreachable");
                break;
        }
        
        return fooBar.compareTo(fooBar);  // This will call the overloaded method in FooBar
    }

    private boolean getCondition() {
        return false;  // This method always returns false, ensuring the switch is unreachable
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug());  // Demonstrates the bug
    }
}