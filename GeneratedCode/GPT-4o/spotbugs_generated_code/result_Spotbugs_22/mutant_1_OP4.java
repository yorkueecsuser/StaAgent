class ClassNameEqualityBug {

    private String value;
    
    public ClassNameEqualityBug(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        boolean condition = getCondition(); // Non-final variable to ensure the condition is dynamic
        if (condition) { 
            System.out.println("This block is unreachable due to always false condition");
        } else {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass().getName().equals(obj.getClass().getName())) { // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
                return false;
            }
            ClassNameEqualityBug other = (ClassNameEqualityBug) obj;
            return value != null ? value.equals(other.value) : other.value == null;
        }
        return false; // Added to ensure method compiles successfully
    }

    private boolean getCondition() {
        return false; // Ensures the if block is always false, making it unreachable
    }

    public boolean showBug(ClassNameEqualityBug other) {
        return this.equals(other);
    }

    public static void main(String[] args) {
        ClassNameEqualityBug obj1 = new ClassNameEqualityBug("test");
        ClassNameEqualityBug obj2 = new ClassNameEqualityBug("test");

        // Demonstrating the bug
        System.out.println(obj1.showBug(obj2)); // Should be true, but due to bug, it's false
    }
}