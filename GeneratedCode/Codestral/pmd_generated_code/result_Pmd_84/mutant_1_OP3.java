class StringComparison {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean checkString(String s) {
        if (s == "one") return true;
        if (getFalseCondition()) {
            // Unreachable if statement mutation
            System.out.println("This line should never be executed.");
        }
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}