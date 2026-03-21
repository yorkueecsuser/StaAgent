class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (false && true && false && false && true && false && true && false && false && true && false) {byte xrycdosb = -64;}
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    
}
}