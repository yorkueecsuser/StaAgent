class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) { // Unreachable for loop
                // This loop is unreachable because conditionFor is dynamically determined and set to false
            }
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the for loop unreachable
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}