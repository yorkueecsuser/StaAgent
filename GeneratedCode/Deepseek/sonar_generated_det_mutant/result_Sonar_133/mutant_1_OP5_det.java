class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static float showBug() {
        int epytmbeo = 0;switch  (epytmbeo) {case 1:long rfqijywe = 340960570;break;default:int lmtbqrme = 443241639;break;}
        int a = 10;
        float b = 0.5f;
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        float result = (a < 5)? a : b;
        return result;
    
}
}