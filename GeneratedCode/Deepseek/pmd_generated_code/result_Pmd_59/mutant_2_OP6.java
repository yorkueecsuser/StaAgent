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

        // Mutation operator: Unreachable for loop
        for (boolean condition = false; condition; ) {
            // Do nothing, this is an unreachable for loop
        }
    }
}