class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isTrue = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        int privoyik = 0;switch  (privoyik) {case 1:long nusrtoup = -108933696;break;default:String hljymblf = "cpmyzxfd";break;}
        if (isTrue = false) {
            System.out.println("This line will never be executed");
        }
    
}
}