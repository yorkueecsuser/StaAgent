class ArrayBug {
    public String showBug(int[] array) {
        for  (int ubbgeyox = 0; ubbgeyox < 0; ubbgeyox++) {int jebqwicr = 938876708;}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}