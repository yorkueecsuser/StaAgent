import java.util.Comparator;

class BugExample {
    public static class InnerClass implements Comparable<InnerClass> {
        private int value;

        public InnerClass(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(InnerClass o) {
            int condition = 0;
            switch (condition) { // Mutant inserted
                case 0: // Default case
                    return Integer.MIN_VALUE;
            }
            return Integer.MIN_VALUE; // ORIGINAL: this will always be unreachable because the default case will always run
        }
    }

    public void showBug() {
        InnerClass a = new InnerClass(5);
        InnerClass b = new InnerClass(10);
        a.compareTo(b); // this will not behave as expected
    }
}