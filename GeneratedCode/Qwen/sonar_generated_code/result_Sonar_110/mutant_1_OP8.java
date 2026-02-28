class NullPointerExample {

    // Method to demonstrate the null pointer dereference bug
    public String showBug(String input) {
        return input.length() + " characters"; // BUG: Null pointers should not be dereferenced
    }

    // Mutated method with renamed variable
    public String showBug(String x) {
        return x.length() + " characters"; // BUG: Null pointers should not be dereferenced
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException

        // Mutated call with renamed variable
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}