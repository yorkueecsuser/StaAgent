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

    public static void unreachableSwitch() {
        boolean shouldRun = getCondition();
        switch (shouldRun) {
            case true:
                System.out.println("This code is unreachable");
                break;
            case false:
                System.out.println("This code is reachable");
                break;
        }
    }
}