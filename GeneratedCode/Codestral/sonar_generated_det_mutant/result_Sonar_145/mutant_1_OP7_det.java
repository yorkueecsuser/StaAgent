class ArrayBug {
    public String showBug(int[] array) {
        boolean whpjuzqr = false;while (whpjuzqr && false && true && true && true && false && false && true && false && false && false && false) {int pktkclqv = -92449954;}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}