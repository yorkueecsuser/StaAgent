class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            // Inserting an unreachable for loop as per the mutation operator
            boolean conditionForLoop = getUnreachableCondition();
            for (int i = 0; conditionForLoop; i++) {
                // Unreachable code
                System.out.println("This loop is unreachable");
            }
            return false;
        }
    }

    private boolean getUnreachableCondition() {
        // Return a condition that makes the for loop unreachable
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));
    }
}