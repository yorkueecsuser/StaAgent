class NullPointerExample {

    // Method to demonstrate the null pointer dereference bug
    public String showBug(String input) {
        // Introduced an unreachable for loop as per the mutation operator
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            System.out.println("This loop should never execute");
        }
        
        return input.length() + " characters"; // BUG: Null pointers should not be dereferenced
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}