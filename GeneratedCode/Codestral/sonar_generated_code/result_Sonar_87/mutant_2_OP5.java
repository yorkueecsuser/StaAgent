class ClassLoaderBug {
    public ClassLoader showBug() {
        // BUG: JEE applications should not "getClassLoader"
        ClassLoader cl = this.getClass().getClassLoader();

        // Added Mutant Code: Unreachable Switch Statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This case is unreachable due to the condition in the switch statement
                throw new RuntimeException("Unreachable code executed");
        }

        return cl;
    }

    // Method to return a value that makes the switch statement unreachable
    private int getUnreachableValue() {
        return 0;
    }
}