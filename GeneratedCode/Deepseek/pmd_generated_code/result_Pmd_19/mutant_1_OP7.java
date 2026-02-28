class BrokenNullCheck {
    private boolean conditionWhile = true;

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        while (conditionWhile) {
            if(string == null) {
                break;
            } else {
                string = "";
            }
        }
        return null;
    }
}