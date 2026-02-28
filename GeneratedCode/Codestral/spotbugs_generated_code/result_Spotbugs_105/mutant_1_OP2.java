class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        boolean result = array1.equals(array2);
        boolean duplicatedResult = array1.equals(array2); // Mutant: Duplicated statement
        return result;
    }
}