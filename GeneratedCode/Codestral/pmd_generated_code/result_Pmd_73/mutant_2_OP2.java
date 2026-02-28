class BuggyStringBuffer {
    public int showBug() {
        StringBuffer sb = new StringBuffer('c');
        StringBuffer sbDuplicate = sb; // Mutant code: Duplicate the assignment statement
        return sb.capacity();
    }
}