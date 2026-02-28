class BugExample {
    public int showBug() {
        int target = -5;
        int num = 3;
        target =- num; // Noncompliant: target = -3. Is that the intended behavior? // BUG: Non-existent operators like "=+" should not be used
        return target;
    }
}