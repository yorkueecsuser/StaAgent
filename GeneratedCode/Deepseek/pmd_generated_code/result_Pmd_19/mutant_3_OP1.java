class BrokenNullCheck {
    public String showBug(String string) {
        String deadStore = "deadStore"; // Dead Store mutation
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    }
}