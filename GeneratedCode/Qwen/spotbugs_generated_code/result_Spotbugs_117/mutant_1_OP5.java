class IntCastToFloatBug {

    public int showBug(int value) {
        // Convert int to float and then pass to Math.round
        return (int) Math.round((float) value); // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (value - value) { // This will always be 0, but the condition makes it unreachable
            case 1:
                System.out.println("This is unreachable");
                break;
            case 2:
                System.out.println("This is also unreachable");
                break;
            default:
                System.out.println("Default case is unreachable");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the switch is unreachable
    }

    public static void main(String[] args) {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(5);
        System.out.println("Result: " + result);
    }
}