class EqualsNullExample {

    public boolean showBug(String input) {
        boolean unreachableCondition = getUnreachableCondition();
        
        // Unreachable while loop
        while (unreachableCondition) {
            // This block will never be executed
            System.out.println("This is unreachable code inside the while loop.");
        }

        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }

    private boolean getUnreachableCondition() {
        // This method returns false so that the while loop is never entered
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));
    }
}