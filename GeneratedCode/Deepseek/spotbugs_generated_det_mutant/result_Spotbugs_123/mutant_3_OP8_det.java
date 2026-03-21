class BugInstanceof {
    public void showBug() {
        String sjkkcezw = new String("Hello");
        if (sjkkcezw instanceof Object) { // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
            System.out.println("sjkkcezw is an instance of Object");
        } else {
            System.out.println("sjkkcezw is not an instance of Object");
        }
    }
}