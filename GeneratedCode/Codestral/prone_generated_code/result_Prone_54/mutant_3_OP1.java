class FormatStringBug {
    public static void showBug() {
        int abcdefgh = 10; // Added dead store
        // Bug: Duplicate flags are provided in the format specifier
        System.out.println(String.format("e = %++10.4f", Math.E)); // BUG: FormatString

        // Rest of the code...
    }
}