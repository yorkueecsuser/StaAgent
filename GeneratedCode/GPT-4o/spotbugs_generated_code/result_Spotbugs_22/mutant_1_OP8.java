class ClassNameEqualityBug {

    private String a; // Renamed from 'value'
    
    public ClassNameEqualityBug(String a) { // Renamed parameter from 'value'
        this.a = a; // Adjusted to use the renamed variable
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
        return a != null ? a.equals(other.a) : other.a == null; // Adjusted to use the renamed variable
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