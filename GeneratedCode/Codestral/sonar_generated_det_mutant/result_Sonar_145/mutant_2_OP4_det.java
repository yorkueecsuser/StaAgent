class ArrayBug {
    public String showBug(int[] array) {
        if (true && true && true && false && true && false && true && false && false && false && false) {char xefmlfsi = 'b';}else{char cizsxzdc = 'x';}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}