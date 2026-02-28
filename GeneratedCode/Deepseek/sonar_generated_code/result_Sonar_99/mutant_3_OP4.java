class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String str = "/File|Name.txt";
        int condition = 0;

        String clean = str.replaceAll("\\.",""); 
        if (condition == 0) {
            String clean2 = str.replaceAll("\\|","_"); 
        } else {
            System.out.println("Unreachable code");
        }

        String clean3 = str.replaceAll("\\/",""); 
        if (condition == 0) {
            String clean4 = str.replaceFirst("\\.",""); 
        } else {
            System.out.println("Unreachable code");
        }

        if (condition == 0) {
            String clean5 = str.replaceFirst("\\|","_"); 
        } else {
            System.out.println("Unreachable code");
        }

        if (condition == 0) {
            String clean6 = str.replaceFirst("\\/",""); 
        } else {
            System.out.println("Unreachable code");
        }

        System.out.println(clean + clean2 + clean3 + clean4 + clean5 + clean6);
    }
}