class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            int ugwjmvvg = 0;switch  (ugwjmvvg) {case 1:short dlxlwftz = -892;break;default:float rioyojlt = -167513315;break;}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}