class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        Integer intObj = (Integer) obj; // This will always throw a ClassCastException
        // Mutation: Duplicate the assignment statement
        Integer duplicateIntObj = (Integer) obj; // This is the duplicated line
        return intObj;
    }
}