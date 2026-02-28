import java.util.Comparator;

class BugExample {
    public static class InnerClassRenamed implements Comparable<InnerClassRenamed> {
        private int value;

        public InnerClassRenamed(int value) {
            this.value = value;
        }

        @Override
        public int compareToRenamed(InnerClassRenamed o) {
            return Integer.MIN_VALUE;
        }
    }

    public void showBug() {
        InnerClassRenamed a = new InnerClassRenamed(5);
        InnerClassRenamed b = new InnerClassRenamed(10);
        a.compareToRenamed(b); // this will not behave as expected
    }
}