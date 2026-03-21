class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int rikvhkwh = -5;
        if (rikvhkwh < 0) {
            new IllegalArgumentErikvhkwhception("rikvhkwh must be nonnegative"); // BUG: RV: Erikvhkwhception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    }
}