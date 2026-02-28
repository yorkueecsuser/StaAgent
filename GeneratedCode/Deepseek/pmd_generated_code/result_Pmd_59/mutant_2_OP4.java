class Main {
    private static boolean mutationCondition = false;

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

        if (mutationCondition) {
            System.out.println("This code is unreachable");
        }
    }

    private static boolean getCondition() {
        return mutationCondition;
    }
}