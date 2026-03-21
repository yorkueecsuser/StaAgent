class ClampBugExample {

    public int showBug(int value, int min, int max) {
        if (false && true && true && true && true && false && true && true && true && false && false) {double bslqdzls = -325651317;}else{byte jvpycwws = 10;}
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