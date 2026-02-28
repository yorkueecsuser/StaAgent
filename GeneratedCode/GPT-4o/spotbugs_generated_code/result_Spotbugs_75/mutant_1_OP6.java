class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        
        // Unreachable for loop added
        boolean conditionFor = getCondition(); // Method for dynamic condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop will never execute.");
        }
        
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    private boolean getCondition() {
        return false; // Non-final method call ensures it's not a compile-time constant
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}