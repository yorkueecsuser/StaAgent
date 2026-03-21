class ArrayBug {
    public String showBug(int[] array) {
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    }
}