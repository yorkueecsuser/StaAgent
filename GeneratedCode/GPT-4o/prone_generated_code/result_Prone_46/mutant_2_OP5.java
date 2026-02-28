class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));

        // Introduce an unreachable switch statement
        int unreachableSwitchVariable = getUnreachableValue();
        switch (unreachableSwitchVariable) {
            case 999: // This case will never be reached
                System.out.println("This statement is unreachable.");
                break;
            default: // Ensures no compile-time error for missing default
                break;
        }
    }

    // Dummy method to create a non-final variable for the switch
    private static int getUnreachableValue() {
        return -1; // Always returns a value that doesn't match the case
    }
}