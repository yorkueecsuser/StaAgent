class CompareToOverloadingBug {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(Bar rhs) {  // Noncompliant: Parameter should be of type Bar. Bug: "compareTo" should not be overloaded
            return 0;
        }

        public int compareTo(FooBar rhs) {  // Mutated code starts here
            return 0;
        }

        public int compareTo(Bar a) {  // Renamed parameter 'a' for mutation
            return 1;
        }
    }

    public void showBug() {
        FooBar fooBar1 = new FooBar();
        FooBar fooBar2 = new FooBar();
        FooBar a = new FooBar();  // Renamed 'fooBar1' to 'a' for mutation
        System.out.println("Comparing fooBar1 to fooBar2: " + a.compareTo(fooBar2));  // Using renamed variable
        System.out.println("Comparing a to fooBar2: " + a.compareTo(fooBar2));  // Using mutated method
    }

    public static void main(String[] args) {
        CompareToOverloadingBug bug = new CompareToOverloadingBug();
        bug.showBug();
    }
}