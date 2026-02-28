class BuggyStringBuffer {
    public int showBug() {
        StringBuffer sb = new StringBuffer('c');
        boolean isUnreachable = false;
        if (isUnreachable) {
            // Unreachable code
            int x = 10;
            x++;
        } else {
            // Original code
            return sb.capacity();
        }
    }
}