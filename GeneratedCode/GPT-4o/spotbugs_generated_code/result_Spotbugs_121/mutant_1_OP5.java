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

        // Mutation Operator: Unreachable switch statement
        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never print");
                break;
            default:
                System.out.println("Default case which is also unreachable");
                break;
        }

        return result;
    }

    private int getUnreachableValue() {
        return 0; // This ensures the switch statement is unreachable as 0 is not handled
    }
}