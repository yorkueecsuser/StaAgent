class ArrayBug {
    public String showBug(int[] array) {
        if (false && true && false && true && false && true && false && false && true && false && false) {short dmoqrnjy = -521;}else{short vlxhvyky = -7251;}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}