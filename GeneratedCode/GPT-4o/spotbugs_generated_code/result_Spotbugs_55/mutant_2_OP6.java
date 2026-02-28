class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        
        // Introducing an unreachable for loop as per the mutation operator
        boolean shouldExecuteLoop = false; // Non-final variable to prevent compile-time error
        for (int i = 0; shouldExecuteLoop; i++) {
            System.out.println("This loop is unreachable and won't execute.");
        }

        if (input != null && input.isEmpty()) {
            result = "Input string is empty";
        }
        
        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return result.toUpperCase(); // This line will throw a NullPointerException if input is null
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}