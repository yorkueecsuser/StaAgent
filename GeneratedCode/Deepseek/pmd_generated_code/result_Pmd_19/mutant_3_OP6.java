class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        // Mutation: Unreachable for loop
        for (int i = 0; i < 1; i++) {
            // Do nothing
        }
        return null;
    }
}