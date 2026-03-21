class ClampBugExample {

    public int showBug(int value, int min, int max) {
        int foldsmek = 0;switch  (foldsmek) {case 1:double ffrzqrvs = 809347083;break;default:float xkddxjqx = -758973528;break;}
        // This will throw an IllegalArgumentException if min > max
        return Math.min(max, Math.max(value, min)); // BUG: "Math.clamp" should be used with correct ranges
    
}

    public static void main(String[] args) {
        ClampBugExample example = new ClampBugExample();
        try {
            int result = example.showBug(10, 5, 1);
            System.out.println("Clamped value: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}