class ClassLoaderBug {
    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();

        // Mutant code - unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0;!conditionFor; i++) {
            System.out.println("This line should never be executed");
        }

        return cl;
    }

    // Method to return the condition for the loop
    private boolean getCondition() {
        return false;
    }
}