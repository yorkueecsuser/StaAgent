class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        StringBuffer sb = new StringBuffer((int)'c');
        return sb.capacity();
    }
}