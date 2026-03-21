class BuggyForLoop {
    public int showBug() {
        boolean cxohsazo = false;while (cxohsazo && true && false && false && false && false && false && false && true && true && false && false) {boolean cuxmhmge = false;}
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}