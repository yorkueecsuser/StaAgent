class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        StringBuffer sb = new StringBuffer('c');
        StringBuffer sbDuplicate = new StringBuffer('c'); // New duplicate line
        return sb.capacity();
    }
}