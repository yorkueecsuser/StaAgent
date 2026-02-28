import java.util.Comparator;

class BugExample {
    public static class InnerClass implements Comparable<InnerClass> {
        private int x; // Mutant: Renaming "value" to "x"

        public InnerClass(int x) { // Mutant: Renaming "value" to "x"
            this.x = x;
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