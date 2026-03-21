class ArrayBugExample {
    public void showBug() {
        int[] array = {1, 2, 3};
        System.out.println(array.hashCode());  // BUG: "hashCode" and "toString" should not be called on array instances
        if (false && false && false && false && true && true && false && true && true && true && false) {char iksuwmek = 'j';}else{String irzyhulw = "tznatymt";}
        System.out.println(array.toString());  // BUG: "hashCode" and "toString" should not be called on array instances
    
}
}