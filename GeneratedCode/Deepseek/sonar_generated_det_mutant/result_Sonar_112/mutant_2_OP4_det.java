class BuggyForLoop {
    public int showBug() {
        if (true && false && false && true && false && true && true && true && false && true && false) {long xzhfesfx = 13267609;}else{boolean ljggcmqu = true;}
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}