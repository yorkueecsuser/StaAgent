class IntComparisonBug {
    public boolean getCondition() {
        return false;
    }

    public int getValue() {
        return 0;
    }

    public boolean showBug(int value) {
        // Existing bug
        if (value == 2147483648L) {
            // Unreachable switch statement
            int conditionValue = getValue();
            switch(conditionValue) {
                case 1:
                    System.out.println("This code should not be executed.");
                    break;
            }
        }
        return value == 2147483648L;
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}