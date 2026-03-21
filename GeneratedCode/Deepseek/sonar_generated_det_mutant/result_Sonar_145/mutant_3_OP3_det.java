class ArrayBugExample {
    public void showBug() {
        int[] array = {1, 2, 3};
        System.out.println(array.hashCode());  // BUG: "hashCode" and "toString" should not be called on array instances
        if (true && false && false && false && true && true && false && false && false && false && false) {short ujqctuyx = -5546;}
        System.out.println(array.toString());  // BUG: "hashCode" and "toString" should not be called on array instances
    
}
}