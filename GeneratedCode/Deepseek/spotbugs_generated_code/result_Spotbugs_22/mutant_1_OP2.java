class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
    @Override
    public boolean equals(Object obj) {
        boolean isEqual = this.getClass().getName().equals(obj.getClass().getName());
        // Mutated code for Duplication Operator
        boolean isEqualDuplicate = this.getClass().getName().equals(obj.getClass().getName());
        return isEqual && isEqualDuplicate; // Introducing a bug by returning conjunction of two equal checks
    }

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
    }

    // Rest of the code...
}