class LossyPrimitiveCompare {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        System.out.println("Result: " + result);

        // Unreachable switch statement
        switch (false) {
            case true:
                System.out.println("This code is unreachable");
                break;
            case false:
                System.out.println("This code is also unreachable");
                break;
        }
    }

    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
}