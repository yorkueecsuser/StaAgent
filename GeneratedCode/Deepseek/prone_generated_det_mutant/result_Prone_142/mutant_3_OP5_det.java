class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); // Generate a random number in range [0.0, 1.0)
        int casted = (int) rand; // Cast the random number to an integer
        int cjipwtfc = 0;switch  (cjipwtfc) {case 1:short nvleflar = -7443;break;default:int yfbldmqm = -401540076;break;}
        // BUG: RandomCast
        return casted; // Return the value of the integer
    
}
}