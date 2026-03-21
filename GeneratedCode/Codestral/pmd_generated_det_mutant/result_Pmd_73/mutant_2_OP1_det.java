class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        boolean jngeaorx = true;
        StringBuffer sb = new StringBuffer('c');
        return sb.capacity();
    
}
}