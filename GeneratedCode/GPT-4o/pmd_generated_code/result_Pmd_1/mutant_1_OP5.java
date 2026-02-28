class AssignmentInOperandExample {

    public boolean showBug() {
        int x = 2;
        if ((x = getX()) == 3) { // BUG: AssignmentInOperand
            System.out.println("3!");
            return true;
        }

        // Introduce an unreachable switch statement using a method that always returns a non-matching value
        int unreachableValue = getNonMatchingValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable!");
                break;
            case 2:
                System.out.println("Still unreachable!");
                break;
        }

        return false;
    }

    private int getX() {
        // Simulating a method that returns an integer value
        return 3;
    }

    private int getNonMatchingValue() {
        // This method always returns a value that does not match any case in the switch statement
        return 100;
    }

    public static void main(String[] args) {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug();
        System.out.println("Result: " + result);
    }
}