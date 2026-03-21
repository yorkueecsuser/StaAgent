class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
    @Override
    public boolean equals(Object obj) {
        // Original bug
        boolean classNamesEqual = this.getClass().getName().equals(obj.getClass().getName());

        // Mutant: Unreachable switch statement
        boolean shouldNotRun = false;
        switch (shouldNotRun) {
            case true:
                // This case should never be reached
                int x = 10;
                break;
            // Other cases if needed, but none of them should be reachable
        }

        return classNamesEqual;
    }

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
    }

    public static void main(String[] args) {
        //... (remaining code unchanged)
    }
}