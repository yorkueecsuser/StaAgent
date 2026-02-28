class ArrayBug {
    public Object showBug(int[] array) {
        int[] arrayDuplicate = array; // Duplicated assignment
        return arrayDuplicate.hashCode() + " " + arrayDuplicate.toString();
    }
}