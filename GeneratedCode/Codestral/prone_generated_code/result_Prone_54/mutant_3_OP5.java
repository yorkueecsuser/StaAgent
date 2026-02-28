class FormatStringBug {
    private static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() {
        //... original code...

        // Mutation: Unreachable switch statement
        if (getFalseCondition()) {
            int value = 1;
            switch(value) {
                case 2: // This case will never be reached
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }

        //... rest of the original code...
    }
}