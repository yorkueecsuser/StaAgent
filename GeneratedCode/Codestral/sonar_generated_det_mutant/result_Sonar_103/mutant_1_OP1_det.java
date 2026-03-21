class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            char cfmplrau = 'w';
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}