class ArrayBug {
    public String showBug(int[] array) {
        if (true && false && true && true && false && true && true && true && false && true && false) {long qauaehjn = 529213176;}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}