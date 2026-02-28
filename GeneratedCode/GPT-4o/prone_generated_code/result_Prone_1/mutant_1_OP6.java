class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        // Inserting an unreachable for loop as per the mutation operator
        boolean conditionFor = getCondition(); // dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable.");
        }
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }
    
    // A method to ensure the for loop condition is dynamically determined
    private boolean getCondition() {
        return false; // This will make the loop unreachable at runtime
    }
}