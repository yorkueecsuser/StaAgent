class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        else {
            boolean condition = false;
            if (condition) {
                // This is the mutated code to avoid unreachable statement error.
            }
        }
        return null;
    }
}