class ArrayBug {
    public String showBug(int[] array) {
        if (true && false && true && true && true && true && true && true && false && false && false) {byte djtyqdes = 73;}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}