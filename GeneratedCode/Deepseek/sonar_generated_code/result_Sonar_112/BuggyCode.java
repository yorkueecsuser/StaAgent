class BuggyCode {
    public int showBug() {
        int result = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            result += i;
        }
        return result;
    }
}