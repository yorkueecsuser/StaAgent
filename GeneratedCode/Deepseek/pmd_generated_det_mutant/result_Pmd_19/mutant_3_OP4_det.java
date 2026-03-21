class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (true && false && true && true && false && true && true && true && true && true && false) {boolean truachrf = true;}else{char qhutwtfo = 'r';}
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    
}
}