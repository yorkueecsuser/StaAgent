class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        if (false && true && false && true && false && false && true && false && false && false && false) {float fovkpoid = -763940419;}
        StringBuffer sb = new StringBuffer('c');
        return sb.capacity();
    
}
}