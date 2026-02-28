class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input!= null) {
            result = input.toUpperCase();
        }
        
        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This block is intended to be unreachable
            result = "Unreachable Code";
        } else {
            // Alternative unreachable block
            result = "Still Unreachable";
        }

        return result.length() + " characters"; // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}