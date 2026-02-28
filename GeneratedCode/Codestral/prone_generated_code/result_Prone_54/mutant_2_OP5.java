class FormatStringBug {
    // Method to return a false condition
    private static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() {
        // Inserting unreachable switch statement
        if (getFalseCondition()) {
            int value = 1;
            switch(value) {
                case 2:
                    System.out.println("This line should never be reached.");
                    break;
            }
        }

        // Original code continues...
        System.out.println(String.format("e = %++10.4f", Math.E));
        // More code...
    }
}