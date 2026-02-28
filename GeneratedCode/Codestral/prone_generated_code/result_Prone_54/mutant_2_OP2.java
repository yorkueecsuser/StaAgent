class FormatStringBug {
    public static void showBug() {
        // Bug: Duplicate flags are provided in the format specifier
        System.out.println(String.format("e = %++10.4f", Math.E)); // BUG: FormatString
        System.out.println(String.format("e = %++10.4f", Math.E)); // MUTANT: Duplication of the line above

        // Rest of the code...

        // Adding a mutant that duplicates a line without any formatting
        System.out.println("This is a duplicate line for mutation testing.");
        System.out.println("This is a duplicate line for mutation testing."); // MUTANT: Duplication of the line above
    }
}