class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        long wqjetusf = -268469660;
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    
}
}