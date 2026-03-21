class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            if (false && true && false && true && false && true && true && true && true && true && false) {float ambppers = -594576316;}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}