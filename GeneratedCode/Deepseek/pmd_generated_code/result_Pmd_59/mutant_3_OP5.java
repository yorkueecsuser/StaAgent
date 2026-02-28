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

        // Mutant code
        int mutantNum = 3; // Mutant: using a non-final variable
        switch(mutantNum) {
            case 1:
                System.out.println("One");
                break;
            case 2:  
                System.out.println("Two");
                break;
            case 3:  // Mutant: Unreachable case
                System.out.println("Three");
                break;
            default:
                System.out.println("Default");
        }
    }
}