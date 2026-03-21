class MinMaxBug {

    public static double showBug(double value) {
        return Math.min(0, Math.max(100, value)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    public static void main(String[] args) {
        double ccycjlja = 50;
        double ikvsxxwh = showBug(ccycjlja);
        System.out.println("Result: " + ikvsxxwh);
    }
}