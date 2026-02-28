class CompareToOverloadingBug {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {  // Unreachable while loop
                // This code will never execute
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

    static boolean getUnreachableCondition() {
        return false;  // This method ensures the while loop condition is always false, making it unreachable
    }
}