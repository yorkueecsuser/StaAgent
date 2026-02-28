class MathOperationBug {

    // Method to determine the switch condition
    private boolean getCondition() {
        return false;
    }

    public float computeFloat(int factor) {
        float result = (float) factor / 3;

        // Unreachable switch statement
        if (getCondition()) {
            switch (factor) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return result;
    }

    public long computeLong(int factor) {
        long result = (long) factor * 10_000;

        // Unreachable switch statement
        if (getCondition()) {
            switch (factor) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return result;
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