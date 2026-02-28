class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable condition
            return null;
        }

        return null;
    }
}