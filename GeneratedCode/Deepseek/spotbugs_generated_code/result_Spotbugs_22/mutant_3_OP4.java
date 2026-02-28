class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code will never be reached.");
        } else {
            // Original bug-inducing code
            return this.getClass().getName().equals(obj.getClass().getName());
        }
    }

    // Rest of the code remains unchanged
}