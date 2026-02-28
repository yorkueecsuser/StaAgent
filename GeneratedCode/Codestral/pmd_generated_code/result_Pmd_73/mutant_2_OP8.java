class BuggyStringBuffer {
    public int showBug() {
        StringBuffer sb = new StringBuffer('c');
        // Mutant code added for Renaming mutation operator
        StringBuffer ab = sb;
        return ab.capacity();
    }
}