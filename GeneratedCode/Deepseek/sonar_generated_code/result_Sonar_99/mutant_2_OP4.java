class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String str = "/File|Name.txt";

        String clean = str.replaceAll("\\.",""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("\\|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll("\\/",""); // BUG: Inappropriate regular expressions should not be used

        String clean4 = str.replaceFirst("\\.",""); // BUG: Inappropriate regular expressions should not be used
        String clean5 = str.replaceFirst("\\|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean6 = str.replaceFirst("\\/",""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(clean + clean2 + clean3 + clean4 + clean5 + clean6);

        // Generated mutant code for Unreachable If-Else statement
        boolean alwaysFalse = getAlwaysFalse();
        if (alwaysFalse) {
            System.out.println("This line will never be executed due to the alwaysFalse condition.");
        } else {
            System.out.println("This line will always be executed due to the alwaysFalse condition.");
        }
    }

    // Method to always return false
    private static boolean getAlwaysFalse() {
        return false;
    }
}