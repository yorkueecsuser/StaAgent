class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static float showBug() {
        boolean atpyicwp = false;while (atpyicwp && true && false && true && true && true && false && false && false && true && true && false) {byte ozuzwesj = -35;}
        int a = 10;
        float b = 0.5f;
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        float result = (a < 5)? a : b;
        return result;
    
}
}