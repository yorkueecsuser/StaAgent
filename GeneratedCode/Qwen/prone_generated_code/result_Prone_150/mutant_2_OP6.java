import java.util.Comparator;

class SelfComparisonBug {

    public static void main(String[] args) {
        SelfComparisonBug bug = new SelfComparisonBug();
        int result = bug.showBug(5);
        System.out.println("Result of self comparison: " + result);
    }

    public int showBug(int value) {
        Integer number = new Integer(value);
        return number.compareTo(number); // BUG: SelfComparison

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
        }
    }

    private boolean getCondition() {
        return false;
    }
}