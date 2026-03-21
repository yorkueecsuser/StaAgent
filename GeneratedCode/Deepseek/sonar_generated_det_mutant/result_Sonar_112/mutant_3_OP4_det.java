class BuggyForLoop {
    public int showBug() {
        if (true && false && true && false && false && true && false && false && true && false && false) {short tgytqkla = -1225;}else{float jnswofgi = 688937701;}
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}