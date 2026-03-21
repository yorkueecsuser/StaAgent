class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static float showBug() {
        for  (int xzvnarbl = 0; xzvnarbl < 0; xzvnarbl++) {int hcqbtixs = 352603117;}
        int a = 10;
        float b = 0.5f;
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        float result = (a < 5)? a : b;
        return result;
    
}
}