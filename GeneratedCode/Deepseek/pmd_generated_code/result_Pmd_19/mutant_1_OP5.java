class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        return null;

        // Mutant code: unreachable switch statement
        boolean condition = false;
        if(condition) {
            switch("") {
                case "":
                    break;
            }
        }
    }
}