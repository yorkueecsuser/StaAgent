class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }

        // Inserting an unreachable if branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable because the condition is always false
            System.out.println("Unreachable code");
        }

        return false;
    }
    
    private boolean getUnreachableCondition() {
        // This always returns false to ensure the branch is unreachable
        return false;
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}