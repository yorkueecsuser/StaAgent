class NullPointerExample {

    // Method to demonstrate the null pointer dereference bug
    public String showBug(String input) {
        int dummy = 0; // Introduced dummy assignment for mutation
        int dummyCopy = dummy; // Duplicate of the dummy assignment
        return input.length() + " characters"; // BUG: Null pointers should not be dereferenced
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}