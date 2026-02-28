class StringComparison {
    public boolean checkString(String s) {
        if (s == "one") {
            boolean unreachable = getUnreachableCondition();
            while (unreachable) {
                // Unreachable code
            }
            return true;
        }
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}