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

        // Mutation operator Renaming
        String renamedStr = str;
        String renamedClean = clean;
        String renamedClean2 = clean2;
        String renamedClean3 = clean3;
        String renamedClean4 = clean4;
        String renamedClean5 = clean5;
        String renamedClean6 = clean6;

        System.out.println(renamedClean + renamedClean2 + renamedClean3 + renamedClean4 + renamedClean5 + renamedClean6);
    }
}