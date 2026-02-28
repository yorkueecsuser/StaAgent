class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        
        // Inserting unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            result = "This is unreachable";
        }
        
        return result;
    }

    private boolean getUnreachableCondition() {
        return false; // This method ensures the condition is always false, making the if branch unreachable
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}