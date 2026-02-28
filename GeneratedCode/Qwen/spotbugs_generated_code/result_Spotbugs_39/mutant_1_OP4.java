class ExampleClass {
    private int value;

    public ExampleClass(int value) {
        this.value = value;
    }

    // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    public boolean equal(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        
        // Mutated Code: Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block.");
        } else {
            // This block is also unreachable due to the same reason
            System.out.println("This is another unreachable block.");
        }

        ExampleClass that = (ExampleClass) obj;
        return value == that.value;
    }

    // Method to provide a dynamic condition that always returns false
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