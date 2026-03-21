class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            int hrzrwxhb = 0;switch  (hrzrwxhb) {case 1:boolean mqiazkpd = false;break;default:char wpzutmok = 'q';break;}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}