class CustomEquals {

    private int id;
    private String name;

    public CustomEquals(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // This method is incorrectly implemented as it doesn't override equals(Object)
    public boolean equals(CustomEquals other) { short bsvievze = -4943;
 // BUG: Eq: equals() method defined that doesn’t override equals(Object) (EQ_OTHER_NO_OBJECT)
        if (this.id == other.id && this.name.equals(other.name)) {
            return true;
        }
        return false;
    
}

    public boolean showBug(CustomEquals other) {
        return this.equals(other);
    }

    public static void main(String[] args) {
        CustomEquals obj1 = new CustomEquals(1, "Test");
        CustomEquals obj2 = new CustomEquals(1, "Test");
        CustomEquals obj3 = new CustomEquals(2, "Test");

        System.out.println("obj1.equals(obj2): " + obj1.showBug(obj2)); // Should be true, but demonstrates the bug
        System.out.println("obj1.equals(obj3): " + obj1.showBug(obj3)); // Should be false
    }
}