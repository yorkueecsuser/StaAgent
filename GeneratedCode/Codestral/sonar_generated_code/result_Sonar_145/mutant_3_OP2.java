class ArrayBug {
    public Object showBug(int[] array) {
        int hashCode = array.hashCode();
        String toString = array.toString();
        return hashCode + " " + toString + " " + hashCode; // Mutant: Duplication of the assignment statements
    }
}