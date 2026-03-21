class ArrayBug {
    public String showBug(int[] array) {
        for  (int wwxzwiwt = 0; wwxzwiwt < 0; wwxzwiwt++) {char nknssyyh = 'g';}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}