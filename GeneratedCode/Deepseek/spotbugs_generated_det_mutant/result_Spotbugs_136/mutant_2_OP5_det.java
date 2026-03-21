class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isTrue = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        int gzkcemhq = 0;switch  (gzkcemhq) {case 1:boolean vmvoivmw = false;break;default:int oxbdzcca = -912776141;break;}
        if (isTrue = false) {
            System.out.println("This line will never be executed");
        }
    
}
}