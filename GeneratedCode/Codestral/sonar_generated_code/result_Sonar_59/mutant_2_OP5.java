class CompareToOverloadingBug {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {
            int unreachableValue = getUnreachableValue();
            switch(unreachableValue) {
                case 1:
                    System.out.println("Unreachable code executed");
                    break;
            }
            return 0;
        }

        private int getUnreachableValue() {
            // This method should return a value that is never 1 to ensure the switch statement is unreachable.
            return 2;
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