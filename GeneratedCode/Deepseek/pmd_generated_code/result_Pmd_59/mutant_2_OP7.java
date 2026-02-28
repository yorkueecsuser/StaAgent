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
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }

        // Unreachable while loop mutation
        boolean unreachable = false;
        while (unreachable) {
            System.out.println("Unreachable");
        }
    }
}