class NullDereferenceExample {

    public String showBug(String input) {
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
        // Unreachable switch statement inserted but it won't affect the bug
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            default:
                break;
        }
        // This line will never be reached if input is null
        return input.toUpperCase();
    }
    
    // Method to simulate an unreachable condition
    private int getUnreachableValue() {
        return 0; // Always returns 0, making the switch cases unreachable
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