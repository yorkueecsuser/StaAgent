class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
        boolean isUnreachable = getCondition(); // Add a new variable for controlling the flow
        switch (1) { // Always use compile-time constants that will make this switch unreachable
            case 1: /* code */ break;
            default: break;
        }
    }
    
    public static boolean getCondition() {
        return false; // This will make the switch unreachable
    }
}