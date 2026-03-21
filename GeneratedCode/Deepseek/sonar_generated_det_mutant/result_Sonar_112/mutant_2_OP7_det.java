class BuggyForLoop {
    public int showBug() {
        boolean gmjnvzju = false;while (gmjnvzju && false && true && false && false && false && false && true && true && false && false && false) {String avymbroa = "yrdhndac";}
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}