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

        String deadStore1 = "";
        String deadStore2 = "";
        String deadStore3 = "";
        String deadStore4 = "";
        String deadStore5 = "";
        String deadStore6 = "";

        System.out.println(clean + clean2 + clean3 + clean4 + clean5 + clean6 + deadStore1 + deadStore2 + deadStore3 + deadStore4 + deadStore5 + deadStore6);
    }
}