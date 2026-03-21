class BugInstanceof {
    public void showBug() {
        String str = new String("Hello");
        if (true && false && false && false && false && false && false && false && true && true && false) {boolean bzrabqsz = true;}
        if (str instanceof Object) { // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
            System.out.println("str is an instance of Object");
        } else {
            System.out.println("str is not an instance of Object");
        }
    
}
}