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

        // Mutation Operator: Unreachable switch statement
        boolean condition = false;
        if (condition) {
            switch(3) {
                case 1:
                    System.out.println("Unreachable");
                    break;
                case 2:
                    System.out.println("Still Unreachable");
                    break;
                default:
                    System.out.println("Default");
            }
        }
    }
}