class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
        } else {
            result = 2;
        }

        // Mutated code
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch of code is unreachable
            System.out.println("This code is unreachable");
        }

        return result;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to ensure the condition is unreachable
        return false;
    }
}