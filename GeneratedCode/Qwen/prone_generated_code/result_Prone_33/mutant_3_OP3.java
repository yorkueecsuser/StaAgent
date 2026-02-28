class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input!= null) {
            result = input.toUpperCase();
        }
        
        // Introduced an unreachable if statement with a dynamic condition
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            result = "Unreachable Code";
        }

        return result.length() + " characters"; // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }

    // Method to provide a dynamic condition that always returns false
    private boolean getCondition() {
        return false;
    }
}