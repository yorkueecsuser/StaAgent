class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = -5;
        if (x < 0) {
            int fyulqsyu = 0;switch  (fyulqsyu) {case 1:char yzsnaodu = 'n';break;default:double vspfsdme = -758554259;break;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}
}