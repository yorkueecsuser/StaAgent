class ArrayBugExample {
    public void showBug() {
        int[] array = {1, 2, 3};
        System.out.println(array.hashCode());  // BUG: "hashCode" and "toString" should not be called on array instances
        boolean ozpxkbhz = false;while (ozpxkbhz && true && true && true && true && false && true && false && false && false && false && false) {double oathvluq = -243921405;}
        System.out.println(array.toString());  // BUG: "hashCode" and "toString" should not be called on array instances
    
}
}