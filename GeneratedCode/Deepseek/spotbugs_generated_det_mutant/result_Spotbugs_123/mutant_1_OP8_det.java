class BugInstanceof {
    public void showBug() {
        String cqtaqsdi = new String("Hello");
        if (cqtaqsdi instanceof Object) { // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
            System.out.println("cqtaqsdi is an instance of Object");
        } else {
            System.out.println("cqtaqsdi is not an instance of Object");
        }
    }
}