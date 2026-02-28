class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        String a = input; // Renamed variable 'input' to 'a'
        return a.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }

    public static void main(String[] args) {
        NullPointerExample b = new NullPointerExample(); // Renamed variable 'example' to 'b'
        try {
            System.out.println(b.showBug(null)); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}