class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        int zmkvebhv = 0;switch  (zmkvebhv) {case 1:int gkyuwbyg = -71364509;break;default:byte xuwrvngc = -62;break;}
        // BUG: RandomCast
        return casted; // Return the value of the integer
    
}
}