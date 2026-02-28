class BuggyStringBuffer {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        StringBuffer sb = new StringBuffer('c');
        if (getFalseCondition()) {
            // Unreachable mutant code
            System.out.println("This code is unreachable.");
        }
        return sb.capacity();
    }
}