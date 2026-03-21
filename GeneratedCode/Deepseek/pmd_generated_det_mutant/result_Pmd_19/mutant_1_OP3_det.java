class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (false && true && false && false && true && false && true && false && true && true && false) {short mtlbtevw = 2223;}
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    
}
}