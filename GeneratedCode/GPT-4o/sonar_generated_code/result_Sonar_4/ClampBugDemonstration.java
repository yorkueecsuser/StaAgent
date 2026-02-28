class ClampBugDemonstration {

    public double showBug(double value, double min, double max) {
        // This should clamp the value between min and max
        // But if min > max, this will throw an IllegalArgumentException
        return Math.clamp(value, max, min); // BUG: "Math.clamp" should be used with correct ranges
    }

    public static void main(String[] args) {
        ClampBugDemonstration demo = new ClampBugDemonstration();
        try {
            // Demonstrating the bug by intentionally reversing min and max
            double result = demo.showBug(5.0, 10.0, 2.0);
            System.out.println("Clamped value: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}