class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        
        // Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            conditionWhile = s1 == "one";
            // Unreachable statement
            System.out.println("This is an unreachable statement.");
            break;
        }

        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings

        // Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            // Unreachable statement
            System.out.println("This is an unreachable statement.");
        } else {
            // Unreachable statement
            System.out.println("This is an unreachable statement.");
        }

        // Unreachable switch statement
        int value = 0;
        switch(value) {
            case 1:  // Unreachable case
                System.out.println("This is an unreachable statement.");
                break;
            default:
                System.out.println("This is an unreachable statement.");
                break;
        }

        return false;
    }
}