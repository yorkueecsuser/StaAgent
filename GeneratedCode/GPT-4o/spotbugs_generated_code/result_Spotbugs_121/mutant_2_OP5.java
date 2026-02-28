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
        String result = (String) integerObject; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        
        // Begin of unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            default:
                break;
        }
        // End of unreachable switch statement mutation

        return result;
    }

    private int getUnreachableValue() {
        return 0; // Ensures the switch statement is unreachable
    }
}