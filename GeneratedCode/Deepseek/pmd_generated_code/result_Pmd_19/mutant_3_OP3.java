class BrokenNullCheck {
    private boolean isUnreachableCondition = false;

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    }

    public boolean getUnreachableCondition() {
        return this.isUnreachableCondition;
    }

    public void setUnreachableCondition(boolean unreachableCondition) {
        this.isUnreachableCondition = unreachableCondition;
    }

    public String showMutantBug(String string) {
        // Mutant: Unreachable if statement
        if (string!=null ||!string.equals("")) {
            if (isUnreachableCondition()) {
                return null;
            }
        }
        return null;
    }
}