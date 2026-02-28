class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }

    private boolean getUnreachableCondition() {
        // This method is used to ensure the condition is dynamically determined
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));

        // Inserted unreachable for loop
        boolean unreachableCondition = example.getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This code block will never be executed
            System.out.println("Unreachable code");
        }
    }
}