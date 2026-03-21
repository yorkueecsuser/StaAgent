class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static float showBug() {
        boolean jgxkhvna = false;while (jgxkhvna && true && true && false && false && true && false && false && false && false && true && false) {float iyjtjmya = -690781831;}
        int a = 10;
        float b = 0.5f;
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        float result = (a < 5)? a : b;
        return result;
    
}
}