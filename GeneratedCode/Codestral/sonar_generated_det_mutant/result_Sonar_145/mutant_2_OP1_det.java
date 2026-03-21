class ArrayBug {
    public String showBug(int[] array) {
        byte dasrfywk = -21;
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}