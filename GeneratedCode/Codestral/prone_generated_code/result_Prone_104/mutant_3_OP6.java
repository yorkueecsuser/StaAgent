class MathRoundIntLongBug {

    public int showBug(long number) {
        // BUG: MathRoundIntLong
        boolean unreachableCondition = false; // Non-final variable used as the loop condition
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop
            System.out.println("This code should not be executed.");
        }
        return Math.round(number);
    }
}