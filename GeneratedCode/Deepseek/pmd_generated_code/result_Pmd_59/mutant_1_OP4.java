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
        
        // Mutation: Unreachable if-else statement
        // Mutant condition variable ensures the if-else statement is unreachable
        boolean mutantCondition = false;
        if (mutantCondition) {
            System.out.println("Mutant: If condition is true");
        } else {
            System.out.println("Mutant: If condition is false");
        }
    }
}