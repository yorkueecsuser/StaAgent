class ExampleClass {
    private int value;

    public ExampleClass(int value) {
        this.value = value;
    }

    // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    public boolean equal(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        
        // Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is unreachable code.");
        }

        ExampleClass that = (ExampleClass) obj;
        return value == that.value;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public void showBug(ExampleClass other) {
        System.out.println("Using incorrect method: " + this.equal(other));
    }

    public static void main(String[] args) {
        ExampleClass obj1 = new ExampleClass(10);
        ExampleClass obj2 = new ExampleClass(10);
        obj1.showBug(obj2);
    }
}