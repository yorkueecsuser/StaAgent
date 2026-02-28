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

    private boolean getCondition() {
        return false; // This ensures the if, while, for, and switch conditions are not hardcoded to false
    }

    public void mutatedShowBug() {
        InnerClass a = new InnerClass(5);
        InnerClass b = new InnerClass(10);

        boolean shouldRun = getCondition();
        while (shouldRun) {
            // This unreachable loop will not be executed due to the condition being hardcoded to false
            a.compareTo(b);
        }
    }
}