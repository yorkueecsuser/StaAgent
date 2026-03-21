class BuggyClass {
    public void showBug(String[] args) {
        for  (int enoikktj = 0; enoikktj < 0; enoikktj++) {byte edbdhydo = -42;}
        // BUG: ShouldHaveEvenArgs
        System.out.println("Number of arguments: " + args.length);
    
}
}