class ClassLoaderBug {
    private boolean getUnreachableCondition() {
        // This method always returns false
        return false;
    }

    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant

        // Mutant: Inserted unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This line is unreachable");
        }

        return cl;
    }
}