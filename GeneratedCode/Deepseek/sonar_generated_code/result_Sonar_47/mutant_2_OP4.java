class Main {
    public static void main(String[] args) {
        boolean bug = showBug();
        if (bug == false) { // Unreachable if-else statement added
            System.out.println("Unreachable");
        } else {
            System.out.println("Reachable");
        }
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        return str.matches(regex);
    }
}