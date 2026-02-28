class StringComparison {
    public boolean checkString(String s) {
        if (s == "one") {
            return true; // Original code
        }
        if (s == "one") { // Duplicated code
            return true;
        }
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}