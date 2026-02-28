class Main {

    public static void main(String[] args) {
        showBug();
        showMutant();
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
    }

    public static void showMutant() {
        boolean shouldNotReach = getCondition();
        while(shouldNotReach) {
            int deadSwitch = 0;
            switch(deadSwitch) {
                case 1:
                    System.out.println("Mutant");
                    break;
                default:
                    System.out.println("Default");
            }
        }
    }

    public static boolean getCondition() {
        return false;
    }
}