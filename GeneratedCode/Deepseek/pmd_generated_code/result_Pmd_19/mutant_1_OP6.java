class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        // Generated mutated Java code
        if (string!=null ||!string.equals("")) {
            for (int i = 0; i < 0; i++) {
                // Unreachable loop
            }
            return string;
        }
        return null;
    }
}