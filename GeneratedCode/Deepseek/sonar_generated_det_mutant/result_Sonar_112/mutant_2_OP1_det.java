class BuggyForLoop {
    public int showBug() {
        byte bfxzmmay = 111;
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}