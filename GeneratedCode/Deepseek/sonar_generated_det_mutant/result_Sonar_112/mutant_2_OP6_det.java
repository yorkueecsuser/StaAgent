class BuggyForLoop {
    public int showBug() {
        for  (int rlxeztgz = 0; rlxeztgz < 0; rlxeztgz++) {char gznphdmh = 't';}
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}