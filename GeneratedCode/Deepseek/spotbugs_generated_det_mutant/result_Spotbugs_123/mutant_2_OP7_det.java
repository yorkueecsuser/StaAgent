class BugInstanceof {
    public void showBug() {
        String str = new String("Hello");
        boolean kuqgvvpr = false;while (kuqgvvpr && true && true && true && false && true && true && true && true && true && false && false) {int vlzhuggm = -926532489;}
        if (str instanceof Object) { // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
            System.out.println("str is an instance of Object");
        } else {
            System.out.println("str is not an instance of Object");
        }
    
}
}