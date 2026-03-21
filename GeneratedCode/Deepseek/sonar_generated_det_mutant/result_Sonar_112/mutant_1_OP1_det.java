class BuggyForLoop {
    public int showBug() {
        long lilhbqef = -845334554;
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}