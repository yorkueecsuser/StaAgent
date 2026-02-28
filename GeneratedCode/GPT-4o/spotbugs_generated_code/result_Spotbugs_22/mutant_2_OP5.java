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
        // Unreachable switch statement inserted here
        int switchValue = getSwitchValue(); // Ensure it evaluates to a value not matching any case
        switch (switchValue) {
            case 1:
                System.out.println("This will never print.");
                break;
            case 2:
                System.out.println("Neither will this.");
                break;
            default:
                System.out.println("Nor will this.");
        }
        
        return this.equals(other);
    }
    
    private int getSwitchValue() {
        return 3; // Ensures that none of the switch cases are executed
    }

    public static void main(String[] args) {
        ClassNameEqualityBug obj1 = new ClassNameEqualityBug("test");
        ClassNameEqualityBug obj2 = new ClassNameEqualityBug("test");

        // Demonstrating the bug
        System.out.println(obj1.showBug(obj2)); // Should be true, but due to bug, it's false
    }
}