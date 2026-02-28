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

    // Unreachable switch statement mutant
    public static void unreachableSwitchMutant() {
        int value = 0;
        switch(value) {
            case 1:
                System.out.println("This branch is unreachable");
                break;
            default:
                System.out.println("This is the default branch");
                break;
        }
    }
}