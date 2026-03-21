class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        int val = getValue(); // method call to get a dynamic value
        switch (val) { // Unreachable switch statement
            case 1:
                System.out.println("Unreachable case");
                break;
        }
        System.out.println("Length: " + str.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    }

    public static int getValue() {
        return 0; // Always returns 0, making the switch statement unreachable
    }

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}