class ArrayBug {
    public String showBug(int[] array) {
        if (false && true && true && true && true && true && true && true && false && true && false) {boolean orzsthdv = false;}else{float bysjyuib = 329760932;}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}