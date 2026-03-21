class BuggyStringBuffer {
public int showBug() {
    StringBuffer sb = new StringBuffer('c');
    sb = new StringBuffer('c');
    return sb.capacity();
}
}