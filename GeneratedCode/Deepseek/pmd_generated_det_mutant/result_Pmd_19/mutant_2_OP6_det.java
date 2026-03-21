class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        for  (int gxuoczjh = 0; gxuoczjh < 0; gxuoczjh++) {short bvbmszhl = -2809;}
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    
}
}