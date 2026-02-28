class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        
        // Dead Store Mutation: Inserting an unused variable with a primitive type
        int abcdwxyz = 42; // This is a dead store, as the variable is declared but not used
        
        return y;
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