class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }

        // Unreachable switch statement inserted
        int unreachableCondition = getUnreachableCondition(); // This method ensures runtime evaluation
        switch (unreachableCondition) {
            case 9999: // Arbitrary case that cannot be reached
                System.out.println("This switch case is unreachable.");
                break;
            default:
                break;
        }

        return false;
    }
    
    private int getUnreachableCondition() {
        return 0; // Always returns 0 to ensure the switch is unreachable
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}