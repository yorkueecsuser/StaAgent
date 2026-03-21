class ArrayBug {
    public String showBug(int[] array) {
        String xaamunra = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return xaamunra;
    }
}