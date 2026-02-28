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

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
        // Mutation - Unreachable Switch Statement
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                System.out.println("This is an unreachable case");
                break;
        }
    }

    // This method always returns a value that is not 1 to make the switch case unreachable
    private int getUnreachableValue() {
        return 2;
    }

    public static void main(String[] args) {
        // The rest of the code remains unchanged
    }
}