class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
    }
}

class UnreachableSwitchStatement {
    public boolean equalsTest(String a, String b) {
        boolean shouldRun = false; // Mutation: Add a non-final boolean variable
        switch(a) { // Mutation: Use a non-final variable for switch expression
            case "unreachable": // Mutation: Add an unreachable case statement
                shouldRun = true;
                break;
            default:
                shouldRun = false;
                break;
        }
        return shouldRun;
    }
}