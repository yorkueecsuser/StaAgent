class BuggyCode {

    public boolean showBug(boolean input) {
        if (input = true) {
            input = true; // Duplicated assignment statement
            return true;
        }
        return false;
    }
}