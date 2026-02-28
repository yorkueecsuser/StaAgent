class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        try {
            if (input.equals("trigger")) { // This may throw NullPointerException if input is null
                result = "Triggered!";
            }
        } catch (NullPointerException e) {
            // Mutation: Unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) { 
                case 1:
                    System.out.println("This will never be printed.");
                    break;
                default:
                    break;
            }
            
            // Value of result is guaranteed to be null when a NullPointerException is caught
            return result.toLowerCase(); // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
        }
        return result;
    }

    private int getUnreachableValue() {
        // This method ensures that the switch statement remains unreachable
        return 0;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug(null)); // This will trigger the bug
    }
}