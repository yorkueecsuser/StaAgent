class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static float showBug() {
        if (false && false && true && true && false && false && false && false && true && false && false) {double aeutttku = -759385102;}else{int flzisqjp = 3295273;}
        int a = 10;
        float b = 0.5f;
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        float result = (a < 5)? a : b;
        return result;
    
}
}