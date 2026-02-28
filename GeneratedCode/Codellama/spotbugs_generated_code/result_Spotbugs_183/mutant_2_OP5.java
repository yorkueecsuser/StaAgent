class MS_FINAL_PKGPROTECT {
    public static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println("count = " + count);
    }

    public static void showBug() {
        count = 10;
        System.out.println("count = " + count);
    }

    // Unreachable switch statement
    public static void unreachableSwitch(int value) {
        switch (value) {
            case 0:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
            default:
                // Default case
                System.out.println("Default case");
                break;
        }
    }
}