class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        
        // Unreachable if-else statement using a non-final boolean variable
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is always executed.");
        }

        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
    
    // Method to simulate the unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}