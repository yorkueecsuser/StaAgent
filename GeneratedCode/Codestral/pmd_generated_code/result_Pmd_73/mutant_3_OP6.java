class BuggyStringBuffer {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        StringBuffer sb = new StringBuffer('c');
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("Unreachable loop");
        }
        return sb.capacity();
    }
}