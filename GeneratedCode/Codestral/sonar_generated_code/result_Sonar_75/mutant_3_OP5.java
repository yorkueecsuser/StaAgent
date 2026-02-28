class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        int value = (denominator == 0)? 1 : 0; // A condition that will be false in this case
        switch (value) {
            case 0:
                System.out.println("This case will never be reached");
                break;
        }
        return numerator / denominator; // Noncompliant, possible division by zero
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}