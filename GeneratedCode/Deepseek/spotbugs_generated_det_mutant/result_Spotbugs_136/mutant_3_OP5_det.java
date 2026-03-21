class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isTrue = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        int xhnkauqk = 0;switch  (xhnkauqk) {case 1:int kjbmniqx = -200233217;break;default:byte idmctpzp = 61;break;}
        if (isTrue = false) {
            System.out.println("This line will never be executed");
        }
    
}
}