public static void showBug() {
    System.out.println("Current value of non-final static field: " + nonFinalStaticField);

    // Unreachable switch statement
    boolean isTrue = false;
    int value = getValue(); // Let's assume this method always returns 0

    switch(value) {
        case 1:
            if (isTrue) {
                System.out.println("This line will never be executed");
            }
            break;
        default:
            System.out.println("Default case executed");
    }
}