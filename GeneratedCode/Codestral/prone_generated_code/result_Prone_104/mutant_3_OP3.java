class MathRoundIntLongBug {

    public boolean getCondition() {
        return false; // Dynamically generated condition that always returns false
    }

    public int showBug(long number) {
        // Inserting unreachable if branch
        if (getCondition()) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        }

        // Original code
        return Math.round(number);
    }
}