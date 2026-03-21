class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        boolean pldhsosg = true;
        StringBuffer sb = new StringBuffer('c');
        return sb.capacity();
    
}
}