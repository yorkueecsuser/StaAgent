class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int number = 2; // Mutated code: 'num' is renamed to 'number'
        switch(number) { // The condition is updated to use the renamed variable
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }
    }
}