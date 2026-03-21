class ClampBugExample {

    public int showBug(int value, int min, int max) {
        if (true && false && true && false && false && false && true && true && true && true && false) {double lfxhxksg = -435377049;}else{boolean aegqstbh = false;}
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