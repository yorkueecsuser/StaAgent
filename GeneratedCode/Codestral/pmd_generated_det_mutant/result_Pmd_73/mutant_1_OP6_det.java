class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        for  (int hfplurki = 0; hfplurki < 0; hfplurki++) {byte bbnaekue = -89;}
        StringBuffer sb = new StringBuffer('c');
        return sb.capacity();
    
}
}