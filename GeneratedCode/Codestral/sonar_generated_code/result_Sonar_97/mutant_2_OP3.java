class AbsBug {
    public int showBug(String str) {
        boolean shouldRun = getCondition();
        if (shouldRun) { // unreachable if statement
            System.out.println("This block is unreachable");
        }
        return Math.abs(str.hashCode());
    }

    private boolean getCondition() {
        return false;
    }
}