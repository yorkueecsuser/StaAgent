class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        StringBuffer sb;
        do {
            sb = new StringBuffer('c');
        } while (false);
        return sb.capacity();
    }
}