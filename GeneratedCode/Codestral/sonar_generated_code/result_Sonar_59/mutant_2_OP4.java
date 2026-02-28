class CompareToOverloadingBug {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {  // Noncompliant: Parameter should be of type Bar. Bug: "compareTo" should not be overloaded
            if (getUnreachableCondition()) {  // Inserted unreachable if branch
                throw new IllegalStateException("This branch should be unreachable.");
            }
            return 0;
        }

        private boolean getUnreachableCondition() {
            return false;
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