class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input!= null) {
            result = input.toUpperCase();
        }
        
        // Introduced unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            result = "This will never be executed";
        }
        
        return result.length() + " characters"; // BUG: DereferenceWithNullBranch
    }

    private boolean getUnreachableCondition() {
        return false; // This method ensures the condition is not a compile-time constant
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }
}