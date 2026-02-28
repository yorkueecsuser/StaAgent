class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
    @Override
    public boolean equals(Object obj) {
        boolean alwaysFalse = getCondition();
        for (int i = 0; alwaysFalse; i++) {
            // Unreachable for loop
            System.out.println("This is an unreachable loop");
        }
        return this.getClass().getName().equals(obj.getClass().getName());
    }

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        //... rest of the code remains the same...
    }
}