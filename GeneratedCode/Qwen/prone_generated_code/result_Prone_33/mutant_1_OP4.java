class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input!= null) {
            result = input.toUpperCase();
        }
        
        // Mutant: Inserting an unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            result = "Unreachable Code";
        } else {
            // Alternative code that is also unreachable due to the nature of the condition
            result = "Still Unreachable";
        }

        return result.length() + " characters"; // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }

    // Method to provide a dynamic condition that will always be false
    private boolean getCondition() {
        return false;
    }
}