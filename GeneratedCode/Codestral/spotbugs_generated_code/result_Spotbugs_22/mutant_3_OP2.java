class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
    @Override
    public boolean equals(Object obj) {
        return this.getClass().getName().equals(obj.getClass().getName());
    }

    // Mutant code added based on the Duplication Mutation Operator
    public void duplicateEqualsCheck() {
        this.getClass().getName().equals(this.getClass().getName());
    }

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
        // Calling the mutant method here to duplicate the equals check
        duplicateEqualsCheck();
    }

    public static void main(String[] args) {
        // Rest of the main method remains the same
    }
}