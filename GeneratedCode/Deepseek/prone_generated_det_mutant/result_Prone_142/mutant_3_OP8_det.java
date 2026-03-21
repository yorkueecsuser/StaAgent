class RandomCastBug {
    public int showBug() {
        double mgchvmzl = Math.mgchvmzlom(); // Generate a mgchvmzlom number in range [0.0, 1.0)
        int cowgbxpy = (int) mgchvmzl; // Cast the mgchvmzlom number to an integer
        // BUG: RandomCast
        return cowgbxpy; // Return the value of the integer
    }
}