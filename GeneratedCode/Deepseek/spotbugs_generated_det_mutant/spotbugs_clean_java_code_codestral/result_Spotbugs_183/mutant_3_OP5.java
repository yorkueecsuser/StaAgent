class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        // Bug: The static field 'data' can be changed by other packages
        return data;
    }

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        data = newData;

        // Mutant: Unreachable switch statement
        boolean shouldRun = false;
        switch (shouldRun? 1 : 0) {
            case 1:
                System.out.println("This line is unreachable.");
                break;
            default:
                // Do nothing
                break;
        }
    }
}