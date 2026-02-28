class NonNullFieldExample {

    private String nonNullField; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldExample() {
        // Constructor does not initialize nonNullField
        String a = "example"; // Added line to introduce a new variable for renaming
    }

    public String showBug() {
        return nonNullField; // This will throw a NullPointerException if nonNullField is accessed without initialization
    }

    public static void main(String[] args) {
        NonNullFieldExample b = new NonNullFieldExample(); // Renamed variable 'example' to 'b'
        System.out.println(b.showBug()); // Demonstrates the bug
    }
}