class UnreachableCodeBug {
    public boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
        } else {
            result = 2;
        }

        if (getUnreachableCondition()) { // Inserting unreachable if-else branch
            result = 3; // This block is never executed
        } else {
            // This block is also unreachable, but it's here to satisfy the if-else structure
            // In a real-world scenario, this could be a log statement or any other necessary action
        }

        return result;
    }
}