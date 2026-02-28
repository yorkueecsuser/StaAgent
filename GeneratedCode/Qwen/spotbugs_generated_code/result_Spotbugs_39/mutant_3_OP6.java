class ExampleClass {
    private int value;

    public ExampleClass(int value) {
        this.value = value;
    }

    // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL) 
    public boolean equal(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        ExampleClass that = (ExampleClass) obj;
        return value == that.value;

        // Unreachable for loop inserted
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable loop iteration: " + i);
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always false
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