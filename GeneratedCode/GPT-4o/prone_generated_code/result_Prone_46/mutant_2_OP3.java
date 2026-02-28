class EqualsNullExample {

    public boolean showBug(String input) {
        // Inserting unreachable if branch with a dynamically determined false condition
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            // This block will never execute
            System.out.println("This is an unreachable block!");
        }

        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }

    // Method to return false to simulate the unreachable condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));
    }
}