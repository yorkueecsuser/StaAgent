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

        // Introduced Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable
            System.out.println("This block is reachable");
        } else {
            // This block is unreachable because shouldRun is always false
            System.out.println("This block is unreachable");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the else block unreachable
        return false;
    }
}