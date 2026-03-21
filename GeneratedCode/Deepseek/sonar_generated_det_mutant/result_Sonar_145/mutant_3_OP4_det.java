class ArrayBugExample {
    public void showBug() {
        int[] array = {1, 2, 3};
        System.out.println(array.hashCode());  // BUG: "hashCode" and "toString" should not be called on array instances
        if (false && true && false && false && true && true && true && false && false && false && false) {double asqrwzrh = 656648224;}else{long sgtyksib = -823804580;}
        System.out.println(array.toString());  // BUG: "hashCode" and "toString" should not be called on array instances
    
}
}