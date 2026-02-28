class EqualsNullBug {

    public String showBug(String input) {
        if (input.equals(null)) { // BUG: EqualsNull
            return "Input is null";
        }
        
        // Unreachable if statement mutant
        boolean condition = getUnreachableCondition();
        if (condition) {
            return "This is an unreachable statement";
        }

        return "Input is not null";
    }

    private boolean getUnreachableCondition() {
        return false; // This method will always return false, but it is not a compile-time constant
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        System.out.println(example.showBug(null));
        System.out.println(example.showBug("Hello"));
    }
}