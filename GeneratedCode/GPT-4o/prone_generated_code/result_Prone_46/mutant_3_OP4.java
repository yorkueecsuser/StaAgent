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
        return false; 
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();

        // Unreachable if-else branch
        boolean unreachableCondition = example.getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is an unreachable branch.");
        } else {
            // This is always executed
            System.out.println("Unreachable condition was false.");
        }

        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));
    }
}