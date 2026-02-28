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

        // Introduced Unreachable Switch Statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable switch case.");
                break;
            case 1:
                // This case will always be executed
                System.out.println("This is the reachable switch case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, making the switch case 0 unreachable
        return false;
    }
}