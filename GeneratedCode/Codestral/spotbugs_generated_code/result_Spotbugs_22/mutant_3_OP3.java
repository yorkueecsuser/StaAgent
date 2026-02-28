class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
    @Override
    public boolean equals(Object obj) {
        // Mutant code: Unreachable if statement
        if (isFalse()) {
            // This block is unreachable, causing the bug to remain in the code.
            throw new RuntimeException("This block is unreachable");
        }
        return this.getClass().getName().equals(obj.getClass().getName());
    }

    // Method used to check if the condition is false.
    private boolean isFalse() {
        return false;
    }

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
    }

    public static void main(String[] args) {
        // The rest of the code remains unchanged.
    }
}