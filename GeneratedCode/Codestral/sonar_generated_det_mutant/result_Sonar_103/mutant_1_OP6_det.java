class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            for  (int iilffjbb = 0; iilffjbb < 0; iilffjbb++) {short tyejcfnv = 3403;}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}