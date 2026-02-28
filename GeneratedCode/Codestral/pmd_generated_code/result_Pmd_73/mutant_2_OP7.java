class BuggyStringBuffer {
    public boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public int showBug() {
        StringBuffer sb = new StringBuffer('c');

        // Mutant: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute
            System.out.println("This is an unreachable statement.");
        }

        return sb.capacity();
    }
}