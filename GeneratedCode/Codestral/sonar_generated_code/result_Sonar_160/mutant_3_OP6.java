class IdenticalExpressionsBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(int a, int b) {
        // Add mutant code
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("Unreachable loop executed");
        }

        if (a == a) {
            return true;
        }
        if (b!= b) {
            return false;
        }
        if (a == b && a == b) {
            return true;
        }
        return false;
    }
}