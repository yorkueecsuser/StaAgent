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

    // Unreachable for loop mutant
    public static int unreachableForLoop() {
        int sum = 0;
        for (int i = 0; false; i++) {
            sum += i;
        }
        return sum;
    }
}