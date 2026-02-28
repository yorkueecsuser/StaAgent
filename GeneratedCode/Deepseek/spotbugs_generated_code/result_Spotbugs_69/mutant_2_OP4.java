class RedundantNullCheckBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb!= null) {
            boolean alwaysFalse = getFalseCondition();
            if (alwaysFalse) {
                // Unreachable branch
                return "Unreachable code";
            }
            return sb.toString();
        }
        return null;
    }
}