class BuggyForLoop {
    public int showBug() {
        if (true && false && true && true && true && true && true && false && false && true && false) {float kddcfvhw = -372406655;}
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}