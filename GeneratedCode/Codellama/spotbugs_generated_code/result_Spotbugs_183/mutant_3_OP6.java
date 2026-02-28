class MS_FINAL_PKGPROTECT {
    public static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println("count = " + count);
    }

    public static void showBug() {
        count = 10;
        System.out.println("count = " + count);
    }

    public static void unreachableForLoopMutant() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // code that is never executed
        }
    }
}