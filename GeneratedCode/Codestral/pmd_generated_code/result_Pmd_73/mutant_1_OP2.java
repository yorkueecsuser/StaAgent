class BuggyStringBuffer {
    public int showBug() {
        // Original code
        StringBuffer sb = new StringBuffer('c');
        // Mutant code
        StringBuffer sbDuplicate = new StringBuffer('c');
        return sb.capacity();
    }
}