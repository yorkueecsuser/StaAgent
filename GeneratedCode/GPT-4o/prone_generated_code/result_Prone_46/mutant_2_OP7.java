class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            // Adding unreachable while loop
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {
                // This block is intentionally unreachable
                System.out.println("This is unreachable code.");
            }
            return true;
        } else {
            return false;
        }
    }

    // Method to simulate a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));
    }
}