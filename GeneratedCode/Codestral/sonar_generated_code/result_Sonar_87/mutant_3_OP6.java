class ClassLoaderBug {
    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable for loop mutant starts here
            ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant
            return cl;
            // Unreachable for loop mutant ends here
        }
    }

    private boolean getCondition() {
        return false;  // Always returns false, making the loop unreachable
    }
}