class BuggyStringBuffer {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        // Original code
        StringBuffer sb = new StringBuffer('c');

        // Mutant code
        if (getFalseCondition()) {
            System.out.println("This line should be unreachable");
        }

        return sb.capacity();
    }
}