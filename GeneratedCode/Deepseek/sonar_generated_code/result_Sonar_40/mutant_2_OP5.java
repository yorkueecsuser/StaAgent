class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(s); // Prints "XXXXXX" instead of expected "cXXd".

        // Unreachable Switch Statement.
        int option = 0;
        switch(option) {
            case 1:
                System.out.println("Unreachable");
                break;
            default:
                break;
        }
    }
}