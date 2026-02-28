class ClassLoaderBug {
    private boolean getUnreachableCondition() {
        return false; // always return false to make the condition unreachable
    }

    public ClassLoader showBug() {
        ClassLoader cl = this.getClass().getClassLoader();

        // Mutant code added here
        if (getUnreachableCondition()) {
            // This branch is unreachable
            System.out.println("This statement should never be printed.");
        } else {
            // This branch is always executed
            System.out.println("This statement should always be printed.");
        }

        return cl;
    }
}