class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            for  (int rjmwcjup = 0; rjmwcjup < 0; rjmwcjup++) {short hbjosidz = 1004;}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}