class MathClampBug {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int value = 15;
        int min = 10;
        int max = 5;
        int result = Math.clamp(value, min, max); // BUG: "Math.clamp" should be used with correct ranges
        return result;
    }

    // This mutant is an unreachable switch statement
    public static void unreachableMutant() {
        switch (0) {
            case 1:
                // This will never be executed because the switch condition is always false
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
    }
}