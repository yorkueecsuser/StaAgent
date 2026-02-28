class NullDereferenceExample {

    public String showBug(String input) {
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
        // This line will never be reached if input is null
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        try {
            String result = example.showBug(null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

        // Adding an unreachable for loop mutation
        boolean loopCondition = getCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("This will never be printed.");
        }
    }

    // Method to provide a runtime evaluated condition
    public static boolean getCondition() {
        return false;
    }
}