class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (true && true && false && true && false && true && true && true && true && false && false) {boolean kssqwasj = true;}else{int pxrngobv = -847460721;}
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    
}
}