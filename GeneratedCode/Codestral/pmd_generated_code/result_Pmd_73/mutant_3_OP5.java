class BuggyStringBuffer {
    public int showBug() {
        StringBuffer sb = new StringBuffer('c');
        int value = -1;
        switch(value) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable code");
                break;
        }
        return sb.capacity();
    }
}