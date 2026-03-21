class BuggyClass {
    public void showBug(String[] args) {
        if (true && false && false && false && false && false && true && true && false && false && false) {short eurftqsd = 7414;}
        // BUG: ShouldHaveEvenArgs
        System.out.println("Number of arguments: " + args.length);
    
}
}