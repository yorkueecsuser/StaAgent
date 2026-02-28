class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        
        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This method provides a non-final variable
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("This will also never be printed.");
                break;
            default:
                System.out.println("Default case that should not be reachable.");
                break;
        }
    }

    public int getUnreachableValue() {
        return 0; // Return value that doesn't match any case to ensure the switch is unreachable
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}