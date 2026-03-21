class ArrayBug {
    public String showBug(int[] array) {
        if (false && false && false && false && false && false && true && true && true && true && false) {char xwxiqfny = 'i';}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}