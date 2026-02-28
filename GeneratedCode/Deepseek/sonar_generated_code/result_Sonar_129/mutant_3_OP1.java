import java.util.Comparator;

class BugExample {
    public static class InnerClass implements Comparable<InnerClass> {
        private int value;
        private int dummy;

        public InnerClass(int value) {
            this.value = value;
            this.dummy = Integer.MIN_VALUE; // Mutation: Adding a dead store 'dummy'
        }

        @Override
        public int compareTo(InnerClass o) {
            return Integer.MIN_VALUE;
        }
    }

    public void showBug() {
        InnerClass a = new InnerClass(5);
        InnerClass b = new InnerClass(10);
        a.compareTo(b);
    }
}