class MathRoundIntLongBug {

    public int showBug(long number) {
        // Original code
        int result = Math.round(number);

        // Mutant code
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code is unreachable, but it's included to avoid compile errors
            System.out.println("This is an unreachable statement");
        }

        return result;
    }

    private boolean getUnreachableCondition() {
        // This method returns false to make the while loop unreachable
        return false;
    }
}