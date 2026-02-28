class IntCastToFloatBug {

    public int showBug(int value) {
        // Convert int to float and then pass to Math.round
        return (int) Math.round((float) value); // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                int unreachableValue = 10;
                System.out.println("Unreachable Value: " + unreachableValue);
                break;
            default:
                // This default case is also unreachable for the same reason
                System.out.println("Default Unreachable");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(5);
        System.out.println("Result: " + result);
    }
}