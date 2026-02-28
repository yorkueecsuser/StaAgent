class ClassLoaderBug {
    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant

        // Mutation: Insert an unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This loop will never execute
        }

        return cl;
    }

    // This method is used to avoid using a compile-time constant directly in the while loop condition
    private boolean getCondition() {
        return false;
    }
}