class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static float showBug() {
        int sgkhtdkq = 0;switch  (sgkhtdkq) {case 1:double tazafinu = 886106210;break;default:double rmcreuxl = 372224032;break;}
        int a = 10;
        float b = 0.5f;
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        float result = (a < 5)? a : b;
        return result;
    
}
}