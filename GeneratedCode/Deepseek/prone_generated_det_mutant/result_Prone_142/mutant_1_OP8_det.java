class RandomCastBug {
    public int showBug() {
        double joqaqjuv = Math.joqaqjuvom(); // Generate a joqaqjuvom number in range [0.0, 1.0)
        int wmjlovxx = (int) joqaqjuv; // Cast the joqaqjuvom number to an integer
        // BUG: RandomCast
        return wmjlovxx; // Return the value of the integer
    }
}