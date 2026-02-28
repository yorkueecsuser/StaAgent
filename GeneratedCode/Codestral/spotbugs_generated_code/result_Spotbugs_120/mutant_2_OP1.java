class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        int deadStore = 10; // Dead store mutation
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        return (Integer) obj; // This will always throw a ClassCastException
    }
}