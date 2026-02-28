class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(s); // Prints "XXXXXX" instead of expected "cXXd".
        
        // Mutation: Adding an unreachable switch statement
        int value = getValue();
        switch(value) {
            case 0:
                if (false) {
                    // Unreachable code
                }
                break;
            default:
                break;
        }
    }

    private static int getValue() {
        return 0; // This value makes the switch unreachable
    }
}