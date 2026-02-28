class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input!= null) {
            result = input.toUpperCase();
        }
        
        // Mutant: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            result = "Unreachable Code";
        }

        return result.length() + " characters"; // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }

    // Method to provide a dynamic condition for the mutant
    private boolean getCondition() {
        return false; // This method always returns false, making the if block unreachable
    }
}