class NullParameterBug {
    private static boolean alwaysFalse() {
        return false;
    }

    public static void printLength(String str) {
        if (str == null) {
            int value = 0;
            switch (value) {  // Unreachable switch statement
                case 1:
                    System.out.println("This code should not be reached.");
                    break;
            }
        }
        System.out.println("Length: " + str.length());
    }

    public static void showBug() {
        printLength(null);
    }

    public static void main(String[] args) {
        showBug();
        if (alwaysFalse()) {  // Unreachable block
            System.out.println("This code should not be reached.");
        }
    }
}