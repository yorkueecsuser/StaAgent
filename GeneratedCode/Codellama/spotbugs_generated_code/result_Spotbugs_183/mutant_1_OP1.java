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

    // Dead Store (DeadStore) mutant
    public static void deadStore(int deadStoreVariable) {
        deadStoreVariable = 10;
        System.out.println("count = " + deadStoreVariable);
    }
}