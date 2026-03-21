class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static float showBug() {
        int ljsefcsb = 0;switch  (ljsefcsb) {case 1:boolean czxjmurh = true;break;default:short ktjeuisx = -2609;break;}
        int a = 10;
        float b = 0.5f;
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        float result = (a < 5)? a : b;
        return result;
    
}
}