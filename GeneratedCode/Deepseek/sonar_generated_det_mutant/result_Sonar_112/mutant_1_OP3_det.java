class BuggyForLoop {
    public int showBug() {
        if (true && false && false && true && true && true && false && false && false && false && false) {byte cjgfgxrv = -102;}
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}