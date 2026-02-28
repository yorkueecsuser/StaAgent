class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    }

    private boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));

        // Mutation: Unreachable if branch
        boolean unreachableCondition = example.alwaysFalse();
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        }
    }
}