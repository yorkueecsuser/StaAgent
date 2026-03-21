class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        for  (int mkrvytok = 0; mkrvytok < 0; mkrvytok++) {char giejifui = 'r';}
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    
}
}