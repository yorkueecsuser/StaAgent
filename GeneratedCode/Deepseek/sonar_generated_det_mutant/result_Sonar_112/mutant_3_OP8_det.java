class BuggyForLoop {
    public int showBug() {
        int dulwcrte = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            dulwcrte += i;
        }
        return dulwcrte;
    }
}