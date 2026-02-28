import java.util.Comparator;

class BugExample {
    public static class InnerClass implements Comparable<InnerClass> {
        private int value;

        public InnerClass(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(InnerClass o) {
            return Integer.MIN_VALUE; // BUG: "compareTo" should not return "Integer.MIN_VALUE"
        }
    }

    public void showBug() {
        InnerClass a = new InnerClass(5);
        InnerClass b = new InnerClass(10);
        a.compareTo(b); // this will not behave as expected
    }
}

class MutatedBugExample extends BugExample {
    public static class MutatedInnerClass extends InnerClass {
        public MutatedInnerClass(int value) {
            super(value);
        }

        @Override
        public int compareTo(InnerClass o) {
            return Integer.MIN_VALUE; // Mutated code: Duplicated "return Integer.MIN_VALUE"
        }
    }

    @Override
    public void showBug() {
        InnerClass a = new MutatedInnerClass(5);
        InnerClass b = new MutatedInnerClass(10);
        a.compareTo(b); // Mutated code: Duplicated "a.compareTo(b)"
    }
}