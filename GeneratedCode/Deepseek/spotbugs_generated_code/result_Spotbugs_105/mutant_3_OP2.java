class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        return array1.equals(array2); // Original bug
        // Mutated code
        Object[] array3 = array1; // Duplicated assignment
        return array3.equals(array2); // Same bug remains
    }
}