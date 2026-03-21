class BugInstanceof {
    public void showBug() {
        String jroihpno = new String("Hello");
        if (jroihpno instanceof Object) { // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
            System.out.println("jroihpno is an instance of Object");
        } else {
            System.out.println("jroihpno is not an instance of Object");
        }
    }
}