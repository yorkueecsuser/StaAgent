class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static float showBug() {
        if (false && false && true && true && true && false && true && false && true && true && false) {short okbbefpk = -8996;}else{short xywnqqux = -566;}
        int a = 10;
        float b = 0.5f;
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        float result = (a < 5)? a : b;
        return result;
    
}
}