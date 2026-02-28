class XorPowerBug {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int result = x ^ y;
        System.out.println(result); // BUG: XorPower
        while (false) {
            // unreachable code
        }
    }

    public static int showBug(int x, int y) {
        return x ^ y;
    }
}