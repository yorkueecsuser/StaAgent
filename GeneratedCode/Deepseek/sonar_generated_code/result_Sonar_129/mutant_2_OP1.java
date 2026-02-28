import java.util.Comparator;

class BugExample {
    public static class InnerClass implements Comparable<InnerClass> {
        private int value;

        public InnerClass(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(InnerClass o) {
            String deadStoreVariable = "deadStore"; // Mutation: Inserting unused variable declarations with one primitive type (for example string, int) to a randomly selected basic book in the program. The name of the variable is a string of eight characters randomly generated in the form of [a-z]. Only one dead store is added in each transformation by this operator.
            return Integer.MIN_VALUE;
        }
    }

    public void showBug() {
        InnerClass a = new InnerClass(5);
        InnerClass b = new InnerClass(10);
        a.compareTo(b);
    }
}