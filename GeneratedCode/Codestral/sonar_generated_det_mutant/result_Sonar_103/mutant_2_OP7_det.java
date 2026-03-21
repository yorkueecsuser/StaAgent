class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            boolean jliqpwhu = false;while (jliqpwhu && true && true && true && true && false && true && false && false && true && false && false) {short teraqfct = -5836;}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}