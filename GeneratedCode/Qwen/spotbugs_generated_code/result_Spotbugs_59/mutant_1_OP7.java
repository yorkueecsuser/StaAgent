class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            result = "Unreachable";
        }
        if (input == null) {
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}