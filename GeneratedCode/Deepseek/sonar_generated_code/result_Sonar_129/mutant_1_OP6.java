import java.util.Comparator;

class BugExample {
    public static class InnerClass implements Comparable<InnerClass> {
        private int value;

        public InnerClass(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(InnerClass o) {
            boolean b = false; // This variable is not constant, so it can be used in a for loop condition
            for (; b == false;) {
                /* This for loop is unreachable since 'b' is always false, 
                but it avoids the unreachable statement error */
            }
            return Integer.MIN_VALUE;
        }
    }

    public void showBug() {
        InnerClass a = new InnerClass(5);
        InnerClass b = new InnerClass(10);
        a.compareTo(b);
    }
}