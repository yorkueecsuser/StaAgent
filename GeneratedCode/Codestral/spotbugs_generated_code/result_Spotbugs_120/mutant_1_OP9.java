class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);

        // Mutant: Equivalent Loop Replacement
        int i = 0;
        while (i < 1) {
            i++;
        }
        do {
            i--;
        } while (i > 0);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        return (Integer) obj; // This will always throw a ClassCastException
    }
}