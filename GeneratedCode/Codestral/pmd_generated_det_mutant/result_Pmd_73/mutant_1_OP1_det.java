class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        long uuqozfql = 917677475;
        StringBuffer sb = new StringBuffer('c');
        return sb.capacity();
    
}
}