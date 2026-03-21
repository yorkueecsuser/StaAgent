class BugInstanceof {
    public void showBug() {
        String str = new String("Hello");
        for  (int fucbhdga = 0; fucbhdga < 0; fucbhdga++) {long jdjzxknj = 209385266;}
        if (str instanceof Object) { // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
            System.out.println("str is an instance of Object");
        } else {
            System.out.println("str is not an instance of Object");
        }
    
}
}