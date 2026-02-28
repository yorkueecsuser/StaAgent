class Main {
    public static void main(String[] args) {
        showBug();
        boolean conditionWhile = getFalse();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    public static boolean showBug() {
        String regex = "(?:)*"; 
        String str = "";
        return str.matches(regex);
    }

    public static boolean getFalse() {
        return false;
    }
}