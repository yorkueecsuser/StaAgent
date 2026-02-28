class BrokenNullCheck {
    private String unusedVar = "deadstore"; // Added by Mutation Operator
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    }
}