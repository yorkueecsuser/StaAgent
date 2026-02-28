import java.util.Comparator;

class BugExample {
    public static class InnerClass implements Comparable<InnerClass> {
        private int value;

        public InnerClass(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(InnerClass o) {
            // Mutation: Inserting unreachable if branch into a randomly selected basic block in the program.
            if (true) {
                return Integer.MIN_VALUE; // Mutation: The condition of the inserted branch is always false to make it unreachable.
            } else {
                return 0; // This is to avoid unreachable statement error.
            }
        }
    }

    public void showBug() {
        InnerClass a = new InnerClass(5);
        InnerClass b = new InnerClass(10);
        a.compareTo(b); // this will not behave as expected
    }
}