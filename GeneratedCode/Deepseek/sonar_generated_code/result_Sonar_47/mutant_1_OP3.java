class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        if (false) {
            System.out.println("This is an unreachable statement");
        }
        return str.matches(regex);
    }
}