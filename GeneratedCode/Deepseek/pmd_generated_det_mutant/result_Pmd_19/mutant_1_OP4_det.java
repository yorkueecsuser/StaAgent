class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (false && false && true && false && true && false && true && false && true && true && false) {long idejflzs = -852159162;}else{short lnskxdor = 1327;}
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    
}
}