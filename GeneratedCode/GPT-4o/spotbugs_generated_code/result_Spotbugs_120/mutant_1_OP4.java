class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        
        // Mutation: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never execute.");
        } else {
            System.out.println("This will always execute.");
        }

        return y;
    }

    private boolean getCondition() {
        return false;
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