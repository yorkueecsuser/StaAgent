class BuggyClass {
    public void showBug(String[] args) {
        if (true && true && false && false && false && false && false && false && false && false && false) {char xtlwkjvt = 'v';}
        // BUG: ShouldHaveEvenArgs
        System.out.println("Number of arguments: " + args.length);
    
}
}