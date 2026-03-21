class ArrayBug {
    public String showBug(int[] array) {
        boolean qjcujjfc = false;while (qjcujjfc && true && false && true && true && true && true && false && false && true && true && false) {byte qtzghuls = -29;}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}