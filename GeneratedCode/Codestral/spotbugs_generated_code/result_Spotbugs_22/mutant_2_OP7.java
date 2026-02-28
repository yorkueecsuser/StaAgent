class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // Adding an unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code will never execute
        }

        return this.getClass().getName().equals(obj.getClass().getName());
    }

    // Method to return false for the unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
    }

    // Rest of the code...
}