class BrokenNullCheck {
    // Mutation 1: Renaming variable'string' to 'anotherString'
    public String showBug(String anotherString) {
        // Mutation 1: BrokenNullCheck
        if (anotherString!=null ||!anotherString.equals(""))
            return anotherString;
        return null;
    }
}