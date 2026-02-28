class ClassComparisonBug {
    private String name;

    public ClassComparisonBug(String name) {
        this.name = name;
    }

    // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
    @Override
    public boolean equals(Object obj) {
        boolean conditionFor = getCondition(); // This is to avoid using false directly
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("Unreachable loop executed.");
        }
        return this.getClass().getName().equals(obj.getClass().getName());
    }

    public String getName() {
        return name;
    }

    public void showBug(Object obj) {
        System.out.println("Are the objects equal? " + this.equals(obj));
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        // The main method remains unchanged for the demonstration of the bug
    }
}