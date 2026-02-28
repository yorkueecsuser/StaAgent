class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null;
        System.out.println(x.intValue());

        // Mutation Operator: Unreachable switch statement
        int unreachableSwitch = 1; // Mutant code being added
        switch (unreachableSwitch) {
            case 2: // Unreachable case
                System.out.println("This case will never be executed");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}