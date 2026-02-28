class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        StringBuffer sb = new StringBuffer('c');
        int tjhqjrwa = 0; // Dead store
        return sb.capacity();
    }
}