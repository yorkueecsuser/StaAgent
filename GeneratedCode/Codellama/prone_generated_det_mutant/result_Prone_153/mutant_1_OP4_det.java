class BuggyClass {
    public void showBug(String[] args) {
        if (true && false && false && false && false && false && true && false && false && false && false) {boolean dirhibwl = false;}else{float lhimflsm = 378816620;}
        // BUG: ShouldHaveEvenArgs
        System.out.println("Number of arguments: " + args.length);
    
}
}