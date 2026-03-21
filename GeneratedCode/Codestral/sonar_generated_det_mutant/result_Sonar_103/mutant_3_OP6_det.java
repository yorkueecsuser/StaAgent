class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            for  (int uistvbrr = 0; uistvbrr < 0; uistvbrr++) {String dhvctmka = "pnjmvbsz";}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}