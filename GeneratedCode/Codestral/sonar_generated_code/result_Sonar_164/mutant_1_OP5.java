class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // Introducing unreachable switch statement
        boolean unreachableCondition = false;
        switch (unreachableCondition? 1 : 0) {
            case 1:
                // This block will never be executed
                System.out.println("Unreachable code executed!");
                break;
        }

        // BUG: Floating point numbers should not be tested for equality
        if (myNumber == 3.146f) {
            return true;
        }
        return false;
    }
}