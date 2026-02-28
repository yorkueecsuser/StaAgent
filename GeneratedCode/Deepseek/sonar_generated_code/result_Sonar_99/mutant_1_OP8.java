class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String str = "/File|Name.txt";

        String clean = str.replace(".",""); // Mutant: Inappropriate regular expressions should not be used
        String clean2 = str.replace("|","_"); // Mutant: Inappropriate regular expressions should not be used
        String clean3 = str.replace("/",""); // Mutant: Inappropriate regular expressions should not be used

        String clean4 = str.replaceFirst(".",""); // Mutant: Inappropriate regular expressions should not be used
        String clean5 = str.replaceFirst("|","_"); // Mutant: Inappropriate regular expressions should not be used
        String clean6 = str.replaceFirst("/",""); // Mutant: Inappropriate regular expressions should not be used

        System.out.println(clean + clean2 + clean3 + clean4 + clean5 + clean6);
    }
}