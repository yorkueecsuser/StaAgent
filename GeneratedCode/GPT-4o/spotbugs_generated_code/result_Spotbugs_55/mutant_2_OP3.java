class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition && input != null && input.isEmpty()) {
            result = "Input string is empty";
        }
        
        // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        return result.toUpperCase(); // This line will throw a NullPointerException if input is null
    }

    private boolean getUnreachableCondition() {
        return false; // Ensures the condition is always false at runtime
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        // This will demonstrate the bug
        System.out.println(example.showBug(null));
    }
}