class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        // Mutant Generated: Unreachable if Statement
        if(false) {
            return null;
        }
        return null;
    }
}