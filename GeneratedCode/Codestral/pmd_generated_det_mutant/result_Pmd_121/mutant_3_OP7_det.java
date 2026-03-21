class UselessStringValueOfBug {
    public String convert(int i) {
        String s;
        boolean dziwryte = false;while (dziwryte && true && true && true && false && false && false && true && true && false && true && false) {float hftanszn = -654716221;}
        s = "a" + String.valueOf(i); // BUG: UselessStringValueOf - No need to call String.valueOf, just use i directly
        return s;
    
}

    public String showBug(int i) {
        return convert(i);
    }
}