class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        return str.matches(regex);
    }

    public static boolean showMutant_1() {
        String p = "(?:)*";
        String r = "";
        return r.matches(p);
    }
}