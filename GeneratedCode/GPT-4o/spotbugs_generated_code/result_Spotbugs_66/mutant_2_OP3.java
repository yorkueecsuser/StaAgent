class NullDereferenceExample {

    public String showBug(String input) {
        boolean condition = getFalseCondition(); // Non-final variable for unreachable code
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
        
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
        // This line will never be reached if input is null
        return input.toUpperCase();
    }

    public boolean getFalseCondition() {
        return false; // Method that returns false for unreachable code
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        try {
            String result = example.showBug(null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}