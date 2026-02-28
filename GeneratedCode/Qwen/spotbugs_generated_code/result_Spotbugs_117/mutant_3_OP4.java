class IntCastToFloatBug {

    public int showBug(int value) {
        // Convert int to float and then pass to Math.round
        return (int) Math.round((float) value); // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)

        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is intended to be unreachable
            value += 10;
        } else {
            // This block is also intended to be unreachable
            value -= 10;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(5);
        System.out.println("Result: " + result);
    }
}