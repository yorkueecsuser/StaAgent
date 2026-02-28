class FormatStringBug {
    public static void showBug() {
        //... existing code...

        // Adding unreachable if-else statement
        if (isReachable()) {
            System.out.println("This will never be printed");
        } else {
            // Unreachable block
            int x = 10;
            x /= 0; // This will cause a division by zero error if reached
        }
    }

    public static boolean isReachable() {
        return false;
    }
}