class ArrayBug {
    public Object showBug(int[] array) {
        // Original code
        Object obj1 = array.hashCode() + " " + array.toString();

        // Mutant code: Renaming the variable 'obj1' to 'a'
        Object a = array.hashCode() + " " + array.toString();

        return obj1;
    }
}