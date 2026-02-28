class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        boolean shouldRun = false;
        switch(str.hashCode()) {
            case 0:
                // Empty case
                break;
            default:
                break;
        }
        return str.matches(regex);
    }
}