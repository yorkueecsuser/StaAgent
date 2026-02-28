class BuggyStringBuffer {
    private boolean getCondition() {
        return false;
    }

    public int showBug() {
        StringBuffer sb = new StringBuffer('c');

        // Added mutant code
        if (getCondition()) {
            // Unreachable code
            System.out.println("This code should never execute");
        } else {
            // Alternative code
            System.out.println("Executing alternative code");
        }

        return sb.capacity();
    }
}