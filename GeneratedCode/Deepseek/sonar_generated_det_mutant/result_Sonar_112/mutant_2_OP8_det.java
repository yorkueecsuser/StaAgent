class BuggyForLoop {
    public int showBug() {
        int jmjzyslt = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            jmjzyslt += i;
        }
        return jmjzyslt;
    }
}