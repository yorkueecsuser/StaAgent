class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = -5;
        if (x < 0) {
            int vjtrzuik = 0;switch  (vjtrzuik) {case 1:long bylpdwpf = -326361989;break;default:short aeuvqdha = 5465;break;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}
}