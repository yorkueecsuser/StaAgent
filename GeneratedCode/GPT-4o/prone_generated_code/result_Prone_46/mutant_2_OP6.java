class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            // Adding a unique unreachable for loop
            boolean conditionFor = getUnreachableCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This is unreachable");
            }
            return false;
        }
    }

    // Method to provide a false condition at runtime
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));
    }
}