import java.util.Comparator;

class BugExample {
    public static class InnerClass implements Comparable<InnerClass> {
        private int value;

        public InnerClass(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(InnerClass o) {
            boolean shouldReturnMinValue = false; // Mutant code: Adding an unreachable if-else statement
            if (shouldReturnMinValue) {
                return Integer.MIN_VALUE;
            } else {
                return 0;
            }
        }
    }

    public void showBug() {
        InnerClass a = new InnerClass(5);
        InnerClass b = new InnerClass(10);
        a.compareTo(b); // this will not behave as expected
    }
}