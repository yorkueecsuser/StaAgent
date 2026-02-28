import java.util.Comparator;

class BugExample {
    public static class InnerClass implements Comparable<InnerClass> {
        private int value;

        public InnerClass(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(InnerClass o) {
            boolean condition = false;
            if (condition) {
                return Integer.MIN_VALUE; 
            } else {
                return this.value - o.value; // This branch is never reached
            }
        }
    }

    public void showBug() {
        InnerClass a = new InnerClass(5);
        InnerClass b = new InnerClass(10);
        a.compareTo(b); // this will not behave as expected
    }
}