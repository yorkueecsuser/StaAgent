class LossyPrimitiveCompare {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        System.out.println("Result: " + result);
    }

    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    // Renamed variable "a" to "x"
    public static int showBug(int x, int b) {
        return Float.compare(x, b);
    }
}