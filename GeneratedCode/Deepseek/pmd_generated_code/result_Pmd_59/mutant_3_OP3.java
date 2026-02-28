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
            case 2:  // Mutation: Unreachable if statement
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }

        if (false) {  // Unreachable if statement mutant
            System.out.println("Unreachable code"); // Mutant code
        }
    }
}