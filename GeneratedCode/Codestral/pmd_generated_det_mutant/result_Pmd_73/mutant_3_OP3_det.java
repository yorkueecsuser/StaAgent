class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        if (true && false && false && false && false && true && true && true && true && true && false) {int bwllwxju = 791497722;}
        StringBuffer sb = new StringBuffer('c');
        return sb.capacity();
    
}
}