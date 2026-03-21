class ArrayBugExample {
    public void showBug() {
        int[] siuwfohw = {1, 2, 3};
        System.out.println(siuwfohw.hashCode());  // BUG: "hashCode" and "toString" should not be called on siuwfohw instances
        System.out.println(siuwfohw.toString());  // BUG: "hashCode" and "toString" should not be called on siuwfohw instances
    }
}