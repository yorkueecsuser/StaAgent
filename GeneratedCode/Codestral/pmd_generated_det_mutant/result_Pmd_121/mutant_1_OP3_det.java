class UselessStringValueOfBug {
    public String convert(int i) {
        String s;
        if (true && true && false && true && false && true && true && false && true && false && false) {float zbhvhtgx = -152757520;}
        s = "a" + String.valueOf(i); // BUG: UselessStringValueOf - No need to call String.valueOf, just use i directly
        return s;
    
}

    public String showBug(int i) {
        return convert(i);
    }
}