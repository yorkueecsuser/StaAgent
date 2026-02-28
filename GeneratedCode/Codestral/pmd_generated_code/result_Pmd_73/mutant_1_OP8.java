class BuggyStringBuffer {
    public int showBug() {
        StringBuffer sb = new StringBuffer('c');
        char a = 'c';
        StringBuffer ba = new StringBuffer(a);
        return sb.capacity() + ba.capacity();
    }
}