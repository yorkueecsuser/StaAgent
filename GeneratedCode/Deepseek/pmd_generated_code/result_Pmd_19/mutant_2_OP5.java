class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        else
            switch (string) { // Unreachable switch statement
                case "": 
                    break; // Non-existent break statement
                default: 
                    break;
            }
        return null;
    }
}