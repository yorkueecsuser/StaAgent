class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static float showBug() {
        if (false && false && true && false && true && false && false && false && false && true && false) {float tgeqazki = -742005111;}
        int a = 10;
        float b = 0.5f;
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        float result = (a < 5)? a : b;
        return result;
    
}
}