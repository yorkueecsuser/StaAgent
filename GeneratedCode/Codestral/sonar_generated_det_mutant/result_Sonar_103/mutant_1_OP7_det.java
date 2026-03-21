class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            boolean mscxuavj = false;while (mscxuavj && false && true && true && true && false && false && false && true && false && true && false) {short scfciaah = 2580;}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}