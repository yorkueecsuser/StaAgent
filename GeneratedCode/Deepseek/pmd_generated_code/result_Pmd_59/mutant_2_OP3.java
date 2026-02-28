class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int num = 2;
        switch(num) {
            case 1:
                System.out.println("One");
                break;
            case 2:  // BUG: NonCaseLabelInSwitchStatement
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // added unreachable statement
            System.out.println("This will never be executed");
        } else {
            System.out.println("This will be always executed");
        }
    }

    public static boolean getCondition() {
        return false;
    }
}