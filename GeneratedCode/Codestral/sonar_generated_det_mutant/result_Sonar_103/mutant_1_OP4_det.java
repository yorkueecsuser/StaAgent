class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            if (false && true && false && false && false && true && true && true && false && false && false) {String vmxhspir = "rsxewfku";}else{char qxqwfgnz = 't';}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}