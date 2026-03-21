class ArrayBugExample {
    public void showBug() {
        int[] array = {1, 2, 3};
        System.out.println(array.hashCode());  // BUG: "hashCode" and "toString" should not be called on array instances
        boolean xhbnddnq = false;while (xhbnddnq && true && false && true && false && true && true && true && true && true && true && false) {short dcrfoioc = -3078;}
        System.out.println(array.toString());  // BUG: "hashCode" and "toString" should not be called on array instances
    
}
}