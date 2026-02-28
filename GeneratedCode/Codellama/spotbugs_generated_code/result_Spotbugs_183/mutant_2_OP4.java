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

    // Mutant 1: Insert unreachable else branch
    public static void showBugMutant1() {
        count = 10;
        System.out.println("count = " + count);
        if (false) {
            System.out.println("This else branch is unreachable");
        } else {
            System.out.println("This else branch is reachable");
        }
    }

    // Mutant 2: Insert unreachable if branch
    public static void showBugMutant2() {
        count = 10;
        System.out.println("count = " + count);
        if (true) {
            System.out.println("This if branch is reachable");
        } else {
            System.out.println("This else branch is unreachable");
        }
    }

    // Mutant 3: Insert unreachable if-else branch
    public static void showBugMutant3() {
        count = 10;
        System.out.println("count = " + count);
        if (true) {
            System.out.println("This if branch is reachable");
        } else if (false) {
            System.out.println("This else-if branch is unreachable");
        } else {
            System.out.println("This else branch is unreachable");
        }
    }
}