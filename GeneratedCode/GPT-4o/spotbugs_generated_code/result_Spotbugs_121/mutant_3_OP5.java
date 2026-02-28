class ImpossibleDowncastExample {

    public static void main(String[] args) {
        try {
            new ImpossibleDowncastExample().showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    public String showBug() {
        Object integerObject = Integer.valueOf(42);
        String result = (String) integerObject; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)

        // Mutation: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case will never be reached
                System.out.println("This is unreachable code.");
                break;
            default:
                break;
        }

        return result;
    }

    public int getUnreachableValue() {
        return -1; // Ensures that the switch statement is unreachable
    }
}