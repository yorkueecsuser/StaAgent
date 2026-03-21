class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        Integer duplicateObj = (Integer) obj; // This is the duplicated line
        return duplicateObj; // This will always throw a ClassCastException
    }
}