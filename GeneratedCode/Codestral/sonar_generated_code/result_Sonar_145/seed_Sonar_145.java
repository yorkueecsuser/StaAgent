class ArrayBug {
    public Object showBug(int[] array) {
        return array.hashCode() + " " + array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
    }
}