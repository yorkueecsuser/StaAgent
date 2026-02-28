class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        StringBuffer sb = new StringBuffer('c');

        // MUTATION: Unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code will never be executed
            System.out.println("This is an unreachable block");
        }

        return sb.capacity();
    }

    // Method that always returns false
    private boolean getUnreachableCondition() {
        return false;
    }
}