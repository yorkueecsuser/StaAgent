class BuggyEqualsMethod {
    private String name;

    public BuggyEqualsMethod(String name) {
        this.name = name;
    }

    // Original buggy equals() method
    public boolean equals(BuggyEqualsMethod other) {
        // Mutant: Unreachable if-else statement
        if (alwaysFalse()) {
            // This block is unreachable
            System.out.println("This line should never execute.");
        } else {
            return this.name.equals(other.name);
        }
    }

    // Method that always returns false
    private boolean alwaysFalse() {
        return false;
    }

    // Rest of the code...
}