class BugInstanceof {
    public void showBug() {
        String str = new String("Hello");
        boolean owdrmtbl = false;while (owdrmtbl && true && false && false && true && false && false && true && false && true && false && false) {double pvghomxg = -485583526;}
        if (str instanceof Object) { // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
            System.out.println("str is an instance of Object");
        } else {
            System.out.println("str is not an instance of Object");
        }
    
}
}