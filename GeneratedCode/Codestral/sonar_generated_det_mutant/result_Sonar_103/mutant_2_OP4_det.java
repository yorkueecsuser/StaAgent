class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            if (true && false && false && true && true && false && false && true && true && false && false) {short bbkrfnhs = -4621;}else{long oghqfdvl = -285001261;}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}