class CompareToOverloadingBug {

    static class Bar implements Comparable<Bar> {
        public int compareTo(Bar rhs) {
            return -1;
        }
    }

    static class FooBar extends Bar {
        public int compareTo(FooBar rhs) {
            if (getCondition()) { // This condition will always be false
                throw new RuntimeException("Unreachable code executed");
            } else {
                return 0;
            }
        }

        private boolean getCondition() {
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