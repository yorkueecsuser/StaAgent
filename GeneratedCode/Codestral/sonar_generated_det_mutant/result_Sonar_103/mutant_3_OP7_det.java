class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            boolean fhxglmci = false;while (fhxglmci && false && true && false && false && false && true && true && false && false && false && false) {int pxjvmwnh = 44803716;}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}