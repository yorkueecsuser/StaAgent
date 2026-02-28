class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; 
        String str = "";
        if (getCondition()) { // Non-reachable code start
            switch(getValue()) { 
                case 1:
                    System.out.println("Reachable code");
                    break;
                default:
                    System.out.println("Unreachable code");
                    break;
            } 
        } // Non-reachable code end
        return str.matches(regex);
    }

    // Helper methods to avoid compile-time constants
    public static boolean getCondition() {
        return false;
    }

    public static int getValue() {
        return 0;
    }
}