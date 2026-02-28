class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String str = "/File|Name.txt";

        String clean = str.replaceAll("\\.", ""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("\\|", "_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll("\\/", ""); // BUG: Inappropriate regular expressions should not be used

        String clean4 = str.replaceFirst("\\.", ""); // BUG: Inappropriate regular expressions should not be used
        String clean5 = str.replaceFirst("\\|", "_"); // BUG: Inappropriate regular expressions should not be used
        String clean6 = str.replaceFirst("\\/", ""); // BUG: Inappropriate regular expressions should not be used

        // Generate a random string for the Dead Store mutation
        String deadStoreMutation = "";
        for (int i = 0; i < 8; i++) {
            deadStoreMutation += (char) (Math.random() * 26 + 'a');
        }

        System.out.println(clean + clean2 + clean3 + clean4 + clean5 + clean6);
    }
}