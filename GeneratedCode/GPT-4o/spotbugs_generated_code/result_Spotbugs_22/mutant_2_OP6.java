class ClassNameEqualityBug {

    private String value;

    public ClassNameEqualityBug(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass().getName().equals(obj.getClass().getName())) { // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
            return false;
        }
        ClassNameEqualityBug other = (ClassNameEqualityBug) obj;
        return value != null ? value.equals(other.value) : other.value == null;
    }

    public boolean showBug(ClassNameEqualityBug other) {
        // Unreachable for loop mutation
        boolean conditionFor = getCondition(); // non-final variable to ensure no unreachable statement error
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable due to `conditionFor` being initialized to `false` through the getCondition() method
            System.out.println("This will never print.");
        }

        return this.equals(other);
    }

    // A method to dynamically determine loop condition
    private boolean getCondition() {
        return false; // This ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        ClassNameEqualityBug obj1 = new ClassNameEqualityBug("test");
        ClassNameEqualityBug obj2 = new ClassNameEqualityBug("test");

        // Demonstrating the bug
        System.out.println(obj1.showBug(obj2)); // Should be true, but due to bug, it's false
    }
}