class BugInstanceof {
    public void showBug() {
        String str = new String("Hello");
        for  (int yflhnttl = 0; yflhnttl < 0; yflhnttl++) {double igejokwo = 927862599;}
        if (str instanceof Object) { // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
            System.out.println("str is an instance of Object");
        } else {
            System.out.println("str is not an instance of Object");
        }
    
}
}