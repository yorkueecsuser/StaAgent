class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String str = "/File|Name.txt";

        String clean = str.replaceAll("\\.", "");
        String clean2 = str.replaceAll("\\|", "_");
        String clean3 = str.replaceAll("\\/", "");

        String clean4 = str.replaceFirst("\\.", "");
        String clean5 = str.replaceFirst("\\|", "_");
        String clean6 = str.replaceFirst("\\/", "");

        if (false) {
            System.out.println("This line will never be reached due to the unreachable if statement.");
        }

        System.out.println(clean + clean2 + clean3 + clean4 + clean5 + clean6);
    }
}