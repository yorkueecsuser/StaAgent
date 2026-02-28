class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }

        // Mutation: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be executed");
                break;
            default:
                System.out.println("Default case");
        }
    }

    private int getUnreachableValue() {
        return 0; // This makes the switch statement effectively unreachable
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}