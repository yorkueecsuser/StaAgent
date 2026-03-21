class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        for  (int ahdswuqo = 0; ahdswuqo < 0; ahdswuqo++) {byte bzsoqipc = 64;}
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    
}
}