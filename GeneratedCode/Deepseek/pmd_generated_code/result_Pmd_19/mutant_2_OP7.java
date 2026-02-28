class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        boolean condition = false;
        while (condition) {
            condition = true; // This will make the condition true and the loop unreachable.
        }
        return null;
    }
}