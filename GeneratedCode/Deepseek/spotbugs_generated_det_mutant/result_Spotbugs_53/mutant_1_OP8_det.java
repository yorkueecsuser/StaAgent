class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int lflfcabp = -5;
        if (lflfcabp < 0) {
            new IllegalArgumentElflfcabpception("lflfcabp must be nonnegative"); // BUG: RV: Elflfcabpception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    }
}