class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        char mkxwiuib = 'p';
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    
}
}