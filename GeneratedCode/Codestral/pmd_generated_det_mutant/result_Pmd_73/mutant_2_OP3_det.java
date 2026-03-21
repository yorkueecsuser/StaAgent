class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        if (true && false && true && true && false && true && true && false && false && true && false) {byte wiauwezb = 108;}
        StringBuffer sb = new StringBuffer('c');
        return sb.capacity();
    
}
}