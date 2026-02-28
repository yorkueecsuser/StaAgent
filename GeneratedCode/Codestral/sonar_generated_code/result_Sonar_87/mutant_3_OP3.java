class ClassLoaderBug {
    public ClassLoader showBug() {
        // Inserting unreachable if branch based on the mutation operator
        if (getFalseCondition()) {
            System.out.println("This block is unreachable.");
        }

        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant
        return cl;
    }

    // Method to simulate a dynamically determined false condition
    private boolean getFalseCondition() {
        return false;
    }
}