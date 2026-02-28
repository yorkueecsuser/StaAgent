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
        
        // Mutation: Adding an unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            System.out.println("This will never be printed.");
        }
        
        String result = (String) integerObject; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        return result;
    }
    
    private boolean getUnreachableCondition() {
        return false;
    }
}