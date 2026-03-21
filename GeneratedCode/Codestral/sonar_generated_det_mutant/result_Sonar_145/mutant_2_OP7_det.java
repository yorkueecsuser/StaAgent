class ArrayBug {
    public String showBug(int[] array) {
        boolean jbjggeqc = false;while (jbjggeqc && true && true && false && true && true && true && true && true && false && false && false) {boolean dmjivdci = false;}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}