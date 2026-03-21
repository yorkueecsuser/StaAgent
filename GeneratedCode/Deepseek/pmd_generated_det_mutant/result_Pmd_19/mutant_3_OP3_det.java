class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (true && false && false && true && true && true && true && false && false && false && false) {float kfogjedl = 879419484;}
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    
}
}