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

    // Unreachable if statement mutated code
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        if (false) {
            result = 1;
        }
        System.out.println("Result: " + result);
    }

    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    // Unreachable while loop mutated code
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        while (false) {
            result = 1;
        }
        System.out.println("Result: " + result);
    }

    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    // Unreachable for loop mutated code
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        for (int i = 0; false; i++) {
            result = 1;
        }
        System.out.println("Result: " + result);
    }

    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    // Unreachable if-else statement mutated code
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        if (false) {
            result = 1;
        } else {
            result = 0;
        }
        System.out.println("Result: " + result);
    }

    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    // Unreachable switch statement mutated code
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        switch (0) {
            case 1:
                result = 1;
        }
        System.out.println("Result: " + result);
    }

    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
}