class NullDereferenceExample {

    public String showBug(String input) {
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }

        // Adding unreachable switch statement
        int unreachableValue = 2; // This value should never match any case in the switch
        switch (unreachableValue) {
            case 1:
                System.out.println("This switch case is unreachable");
                break;
            default:
                // Default case to avoid compile-time error
                break;
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
    }
}