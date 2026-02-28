class MathOperationBug {

    public float computeFloat(int factor) {
        return (float) factor / 3;
    }

    public long computeLong(int factor) {
        long result = (long) factor * 10_000;
        // Unreachable switch statement
        switch (getFalseValue()) {
            case 1:
                result = 0;
                break;
        }
        return result;
    }

    private int getFalseValue() {
        return -1;
    }

    public void showBug() {
        System.out.println("Float result: " + computeFloat(2));
        System.out.println("Long result: " + computeLong(214748));
    }

    public static void main(String[] args) {
        MathOperationBug bug = new MathOperationBug();
        bug.showBug();
    }
}