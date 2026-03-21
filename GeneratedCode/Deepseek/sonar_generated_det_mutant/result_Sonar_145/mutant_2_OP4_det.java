class ArrayBugExample {
    public void showBug() {
        int[] array = {1, 2, 3};
        System.out.println(array.hashCode());  // BUG: "hashCode" and "toString" should not be called on array instances
        if (false && true && false && false && false && true && true && false && true && false && false) {byte yvqzmxcn = 111;}else{long yjllxtix = -300027527;}
        System.out.println(array.toString());  // BUG: "hashCode" and "toString" should not be called on array instances
    
}
}