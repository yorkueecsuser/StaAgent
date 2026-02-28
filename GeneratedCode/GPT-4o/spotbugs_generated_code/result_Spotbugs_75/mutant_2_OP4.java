class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        
        // Mutation: Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is also unreachable");
        }
        
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    // Helper method to ensure the condition is not a compile-time constant
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}