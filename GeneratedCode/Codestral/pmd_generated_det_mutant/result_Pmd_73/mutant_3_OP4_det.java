class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        if (true && false && false && true && true && false && true && false && true && false && false) {byte mgtnbwrx = 87;}else{byte rohutzxe = 119;}
        StringBuffer sb = new StringBuffer('c');
        return sb.capacity();
    
}
}