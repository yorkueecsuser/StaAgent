class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }

    // Method to provide a runtime-determined condition
    private boolean unreachableCondition() {
        return false; // This will always be false, but it's not a compile-time constant
    }

    public void demonstrateUnreachableIf() {
        // Inserting an unreachable if branch
        if (unreachableCondition()) {
            System.out.println("This code is unreachable.");
        }
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));

        // Demonstrate the unreachable if branch
        example.demonstrateUnreachableIf();
    }
}