class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            if (false && false && true && false && true && false && true && false && true && false && false) {float uwtwlrpb = 133865194;}else{short nisefmnk = -860;}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}