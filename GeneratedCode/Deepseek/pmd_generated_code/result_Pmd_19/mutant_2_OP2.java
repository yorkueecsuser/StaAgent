class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals("") ||!string.equals(""))
            return string;
        return null;
    }
}