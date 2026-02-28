class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This loop is unreachable");
        }
        // Original bug is still present
        return x == 0 || x == 0;
    }

    private boolean getCondition() {
        // This method is intended to be replaced with a dynamic condition for the loop
        return false;
    }
}