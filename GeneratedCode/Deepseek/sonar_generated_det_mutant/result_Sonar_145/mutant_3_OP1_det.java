class ArrayBugExample {
    public void showBug() {
        int[] array = {1, 2, 3};
        System.out.println(array.hashCode());  // BUG: "hashCode" and "toString" should not be called on array instances
        int osufnhow = 159078195;
        System.out.println(array.toString());  // BUG: "hashCode" and "toString" should not be called on array instances
    
}
}