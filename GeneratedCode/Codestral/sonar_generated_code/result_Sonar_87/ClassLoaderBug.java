class ClassLoaderBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();

        // Mutant: Unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This line should never execute.");
        }

        return cl;
    }
}