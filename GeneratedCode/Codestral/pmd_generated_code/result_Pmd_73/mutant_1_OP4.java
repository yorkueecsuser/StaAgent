class BuggyStringBuffer {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        StringBuffer sb = new StringBuffer('c');
        if (getFalseCondition()) {
            // Unreachable mutant code
            System.out.println("This line will never be executed");
        } else {
            // Original code
            return sb.capacity();
        }
    }
}