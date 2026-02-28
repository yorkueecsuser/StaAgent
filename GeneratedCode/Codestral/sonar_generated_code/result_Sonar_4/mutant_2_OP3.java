class MathClampBug {
    public static int showBug(int value, int min, int max) {
        boolean unreachable = false;
        if (unreachable) {
            System.out.println("This branch should be unreachable.");
        }
        return Math.clamp(value, max, min); // min and max are reversed
    }

    public static boolean getUnreachableCondition() {
        return false; // Simulating an unreachable condition
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        if (getUnreachableCondition()) {
            System.out.println("This branch should be unreachable.");
        }
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}