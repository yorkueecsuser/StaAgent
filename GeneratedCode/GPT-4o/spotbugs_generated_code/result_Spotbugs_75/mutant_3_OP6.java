class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // Using a method to determine the loop condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable.");
        }

        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    // Method to simulate a condition that is always false to make the for loop unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}