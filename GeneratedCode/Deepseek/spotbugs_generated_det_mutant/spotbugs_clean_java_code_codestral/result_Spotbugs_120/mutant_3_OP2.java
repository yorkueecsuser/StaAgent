class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    public static Integer showBug(Object obj) {
        Integer result = (Integer) obj; // Original line
        Integer duplicateResult = (Integer) obj; // Mutated line (duplication of original line)
        return result; // Still throws a ClassCastException
    }
}