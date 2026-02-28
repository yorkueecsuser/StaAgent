class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        // Mutated code:
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    }
}