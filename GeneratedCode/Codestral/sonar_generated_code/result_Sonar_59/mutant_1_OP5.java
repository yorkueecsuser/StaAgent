class CompareToOverloadingBug {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // Noncompliant: Parameter should be of type Bar. Bug: "compareTo" should not be overloaded
            boolean condition = getCondition();
            if (condition) {
                int value = getValue();
                switch(value) {
                    // This switch statement is unreachable because getValue() never returns 1
                    case 1:
                        System.out.println("This line should never be executed");
                        break;
                }
            }
            return 0;
        }
    }

    private static boolean getCondition() {
        // This method ensures that the condition is dynamically determined at runtime
        // For example, it could check a system property or a random number, but for this example, it simply returns false
        return false;
    }

    private static int getValue() {
        // This method ensures that the value is dynamically determined at runtime
        // For this example, it always returns 0, which causes the switch statement to be unreachable
        return 0;
    }

    public void showBug() {
        FooBar fooBar1 = new FooBar();
        FooBar fooBar2 = new FooBar();
        System.out.println("Comparing fooBar1 to fooBar2: " + fooBar1.compareTo(fooBar2));
    }

    public static void main(String[] args) {
        CompareToOverloadingBug bug = new CompareToOverloadingBug();
        bug.showBug();
    }
}