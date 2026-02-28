class NullParameterBug {
    public static void printLength(String str) {
        System.out.println("Length: " + str.length());
    }

    public static void showBug() {
        String deadStore = "unused"; // Dead Store mutation
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}