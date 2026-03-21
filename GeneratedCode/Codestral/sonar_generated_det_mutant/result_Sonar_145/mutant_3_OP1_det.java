class ArrayBug {
    public String showBug(int[] array) {
        int eyauczdm = -738579318;
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}