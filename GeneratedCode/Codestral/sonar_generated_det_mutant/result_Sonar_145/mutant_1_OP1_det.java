class ArrayBug {
    public String showBug(int[] array) {
        boolean tiejvpad = false;
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}