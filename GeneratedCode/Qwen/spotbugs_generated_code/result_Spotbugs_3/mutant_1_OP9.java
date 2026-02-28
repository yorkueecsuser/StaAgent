class NonNullFieldExample {

    private String nonNullField; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldExample() {
        // Constructor does not initialize nonNullField
    }

    public String showBug() {
        return nonNullField; // This will throw a NullPointerException if nonNullField is accessed without initialization
    }

    public static void main(String[] args) {
        NonNullFieldExample example = new NonNullFieldExample();
        
        // Introduced loop that does not affect the bug
        int i = 0;
        while (i < 1) {
            System.out.println("This is a loop that does not affect the bug.");
            i++;
        }

        // Applying Equivalent Loop Replacement mutation operator
        i = 0;
        do {
            System.out.println("This is an equivalent loop that does not affect the bug.");
            i++;
        } while (i < 1);

        System.out.println(example.showBug()); // Demonstrates the bug
    }
}