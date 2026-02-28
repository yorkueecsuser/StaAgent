class BuggyStringBuffer {
    public int showBug() {
        StringBuffer sb = new StringBuffer('c');
        char a = 'c'; // mutant
        StringBuffer rn = new StringBuffer(a); // mutant
        return sb.capacity();
    }
}