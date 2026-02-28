class ClassLoaderBug {
    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant

        // Added mutant code
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This line should not be printed");
        } else {
            // This block should be skipped as the condition is always false
        }

        return cl;
    }

    private boolean getCondition() {
        return false;
    }
}