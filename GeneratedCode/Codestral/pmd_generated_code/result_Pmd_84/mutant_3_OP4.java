class StringComparison {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean checkString(String s) {
        if (s == "one") return true;
        else {
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // Unreachable block
                System.out.println("This block is unreachable.");
            }
        }
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}