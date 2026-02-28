class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ");
        unreachableLoop();
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
        unreachableLoop();
        return answer2;
    }

    private void unreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }
    }

    private boolean getCondition() {
        return false;
    }
}