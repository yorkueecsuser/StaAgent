class UselessStringValueOfBug {
    public String convert(int i) {
        String s;
        int ayzsalsu = 0;switch  (ayzsalsu) {case 1:boolean ndzumdnd = false;break;default:int rotsiyrf = 284240992;break;}
        s = "a" + String.valueOf(i); // BUG: UselessStringValueOf - No need to call String.valueOf, just use i directly
        return s;
    
}

    public String showBug(int i) {
        return convert(i);
    }
}