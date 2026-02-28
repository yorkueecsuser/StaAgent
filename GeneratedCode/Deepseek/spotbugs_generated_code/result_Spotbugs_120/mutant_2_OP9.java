class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
        showMutant(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        return (Integer) obj; // This will always throw a ClassCastException
    }

    // MUTANT: Equivalent Loop Replacement
    public static Integer showMutant(Object obj) {
        do {
            try {
                return (Integer) obj; // This will always throw a ClassCastException
            } catch (ClassCastException e) {
                // do nothing, just to ensure the loop is at least executed once
            }
        } while (true);
    }
}