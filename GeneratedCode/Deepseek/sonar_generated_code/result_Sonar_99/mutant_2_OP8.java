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

        // Mutation: Renaming variables
        String strMutant = "/File|Name.txt";
        String cleanMutant = strMutant.replaceAll("\\.","");
        String clean2Mutant = strMutant.replaceAll("\\|","_");
        String clean3Mutant = strMutant.replaceAll("\\/","");
        String clean4Mutant = strMutant.replaceFirst("\\.","");
        String clean5Mutant = strMutant.replaceFirst("\\|","_");
        String clean6Mutant = strMutant.replaceFirst("\\/","");
        System.out.println(cleanMutant + clean2Mutant + clean3Mutant + clean4Mutant + clean5Mutant + clean6Mutant);
    }
}