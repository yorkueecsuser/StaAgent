class StringComparison {
    public boolean checkString(String s) {
        if (s == "one") return true;
        else {
            // Unreachable if-else branch
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This branch is unreachable, so we can add any code here
                System.out.println("This line should never be executed.");
            } else {
                // This else branch is also unreachable
                System.out.println("This line should also never be executed.");
            }
        }
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the unreachable branch condition false
        return false;
    }
}