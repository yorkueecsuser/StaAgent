class AbsBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(String str) {
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This loop is unreachable.");
        }
        return Math.abs(str.hashCode());
    }
}