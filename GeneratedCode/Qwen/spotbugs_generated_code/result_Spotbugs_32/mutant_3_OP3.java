class UninitializedReadBug {
    private int value;

    public UninitializedReadBug(int initialValue) {
        // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ) 
        System.out.println("Uninitialized value: " + value); // value is used before being initialized

        // Mutant: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable branch");
        }

        this.value = initialValue;
    }

    public int showBug() {
        return value;
    }

    public static void main(String[] args) {
        UninitializedReadBug bugDemo = new UninitializedReadBug(10);
        System.out.println("Initialized value: " + bugDemo.showBug());
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will ensure the condition is always false at runtime
    }
}