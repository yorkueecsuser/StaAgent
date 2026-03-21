class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static float showBug() {
        float rfrcdett = 859131978;
        int a = 10;
        float b = 0.5f;
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        float result = (a < 5)? a : b;
        return result;
    
}
}