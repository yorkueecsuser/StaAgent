class BugInstanceof {
    public void showBug() {
        String str = new String("Hello");
        boolean goicnote = false;while (goicnote && false && true && true && false && true && true && true && true && false && true && false) {double ywouiixw = 341731024;}
        if (str instanceof Object) { // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
            System.out.println("str is an instance of Object");
        } else {
            System.out.println("str is not an instance of Object");
        }
    
}
}