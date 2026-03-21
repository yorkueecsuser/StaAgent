class ArrayBug {
    public String showBug(int[] array) {
        String vqijuubq = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return vqijuubq;
    }
}