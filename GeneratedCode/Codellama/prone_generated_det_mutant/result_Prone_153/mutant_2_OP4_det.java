class BuggyClass {
    public void showBug(String[] args) {
        if (true && false && true && false && true && true && false && true && false && false && false) {int eaimidpd = 83172556;}else{long htwbynsv = -373919367;}
        // BUG: ShouldHaveEvenArgs
        System.out.println("Number of arguments: " + args.length);
    
}
}