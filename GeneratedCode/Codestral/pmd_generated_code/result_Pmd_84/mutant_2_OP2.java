class StringComparison {
    public boolean checkString(String s) {
        if (s == "one") { // original line
            return true;
        }
        // Mutant: Duplicate the assignment statement
        if (s == "one") { // mutant line
            return true;
        }
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}