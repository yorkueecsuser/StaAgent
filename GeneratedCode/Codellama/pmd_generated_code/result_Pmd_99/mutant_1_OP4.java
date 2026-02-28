// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);
        
        // Mutant 1: Unreachable if-else statement
        if (false) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is reachable");
        }
        
        // Mutant 2: Unreachable while loop
        while (false) {
            System.out.println("This loop is unreachable");
        }
        
        // Mutant 3: Unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable");
        }
        
        // Mutant 4: Unreachable if-else statement with compile-time constant
        if (0 == 1) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is reachable");
        }
        
        // Mutant 5: Unreachable switch statement with compile-time constant
        switch (0) {
            case 1:
                System.out.println("This branch is unreachable");
                break;
            default:
                System.out.println("This branch is reachable");
                break;
        }
    }
}