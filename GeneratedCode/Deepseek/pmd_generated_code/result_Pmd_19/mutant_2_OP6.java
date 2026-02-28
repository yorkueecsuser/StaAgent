class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        return null;

        // Mutant: Unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // unreachable code
        }
    }
}