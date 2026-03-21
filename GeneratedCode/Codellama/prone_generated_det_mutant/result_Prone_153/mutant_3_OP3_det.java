class BuggyClass {
    public void showBug(String[] args) {
        // BUG: ShouldHaveEvenArgs
        if (false && false && true && true && false && true && false && false && true && true && false) {float wqlargyc = 750855655;}
        System.out.println("Number of arguments: " + args.length);
    
}
}