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
        if (obj == null || getClass().getName().equals(obj.getClass().getName())) { // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
            return false;
        }
        ClassNameEqualityBug other = (ClassNameEqualityBug) obj;
        return value != null ? value.equals(other.value) : other.value == null;
    }

    public boolean showBug(ClassNameEqualityBug other) {
        // Inserted unreachable if-else statement
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This message is unreachable because the condition is always false.");
        } else {
            System.out.println("This part is always executed.");
        }
        
        return this.equals(other);
    }
    
    // Helper method to generate a false condition at runtime
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        ClassNameEqualityBug obj1 = new ClassNameEqualityBug("test");
        ClassNameEqualityBug obj2 = new ClassNameEqualityBug("test");

        // Demonstrating the bug
        System.out.println(obj1.showBug(obj2)); // Should be true, but due to bug, it's false
    }
}