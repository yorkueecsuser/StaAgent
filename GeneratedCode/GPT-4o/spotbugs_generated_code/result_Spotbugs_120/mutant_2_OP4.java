class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        
        // Mutation: Unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This code will never be executed because condition is always false
            System.out.println("This is unreachable code.");
        } else {
            // This else block serves no real purpose but is used to ensure the mutation is valid
            System.out.println("This is the reachable else block.");
        }
        
        return y;
    }

    private boolean getCondition() {
        return false; // Ensures that the if condition is always false
    }

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        try {
            example.showBug();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}