class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        int nlsibwlp = 0;switch  (nlsibwlp) {case 1:boolean kbyuugbl = true;break;default:byte tkzlhiwl = -73;break;}
        // BUG: RandomCast
        return casted; // Return the value of the integer
    
}
}