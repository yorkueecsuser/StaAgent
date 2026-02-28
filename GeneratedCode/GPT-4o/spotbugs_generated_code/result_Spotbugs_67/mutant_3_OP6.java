class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        try {
            if (input.equals("trigger")) { // This may throw NullPointerException if input is null
                result = "Triggered!";
            }
        } catch (NullPointerException e) {
            // Unreachable for loop mutation
            boolean conditionFor = getFalseCondition();
            for (int i = 0; conditionFor; i++) { 
                System.out.println("This loop is unreachable and should never be printed.");
            }
            // Value of result is guaranteed to be null when a NullPointerException is caught
            return result.toLowerCase(); // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
        }
        return result;
    }

    private boolean getFalseCondition() {
        return false; // This ensures the loop is never executed
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug(null)); // This will trigger the bug
    }
}