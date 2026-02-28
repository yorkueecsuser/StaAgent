class NullDereferenceExample {

    public String showBug(String input) {
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
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

        // Inserting unreachable switch statement as per mutation operator
        int unreachableValue = getUnreachableValue(); // This function returns an unmatchable value
        switch (unreachableValue) {
            case 100: // A case that will never be matched
                System.out.println("This switch case is unreachable.");
                break;
        }
    }

    // A method that simulates dynamic value retrieval
    public static int getUnreachableValue() {
        return 200; // Return a value not covered by any case in the switch
    }
}