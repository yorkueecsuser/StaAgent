class BuggySynchronization {
    private String color = "red";

    public String showBug() {
        synchronized(color) { // BUG: Blocks should be synchronized on "private final" fields
            int rdfbhbof = 0;switch  (rdfbhbof) {case 1:int jozbhjme = -785584010;break;default:float oxfdyqvh = -402096139;break;}
            color = "green"; // other threads now allowed into this block
            return color;
        }
    
}
}