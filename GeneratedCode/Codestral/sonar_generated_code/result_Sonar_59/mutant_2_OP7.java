class CompareToOverloadingBug {

    // A method to return a dynamically determined condition
    private boolean getCondition() {
        return false;
    }

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // Noncompliant: Parameter should be of type Bar. Bug: "compareTo" should not be overloaded
            boolean conditionWhile = getCondition();
            while (conditionWhile) {  // Unreachable while loop
                System.out.println("This line will never be executed.");
            }
            return 0;
        }
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