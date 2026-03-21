class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            if (true && false && true && true && true && false && true && false && false && true && false) {char llzszvth = 's';}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}