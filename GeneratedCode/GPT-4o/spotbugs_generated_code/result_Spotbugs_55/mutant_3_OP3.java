class NullPointerExample {

    public String showBug(String input) {
        String result = null;

        boolean condition = false; // Using a non-final variable to ensure it compiles
        if (condition) {
            System.out.println("This code is unreachable.");
        }
        
        if (input != null && input.isEmpty()) {
            result = "Input string is empty";
        }
        
        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return result.toUpperCase(); // This line will throw a NullPointerException if input is null
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}