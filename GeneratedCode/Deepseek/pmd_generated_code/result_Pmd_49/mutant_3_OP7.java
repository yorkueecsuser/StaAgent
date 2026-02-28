class InstantiationToGetClass {
    boolean conditionWhile = false;
    boolean conditionFor = false;
    boolean shouldRun = false;
    int value = 0;

    public Class showBug() {
        Class c = new String().getClass();
        // Mutation: Adding an unreachable while loop
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }
        // Mutation: Adding an unreachable for loop
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable");
        }
        // Mutation: Adding an unreachable if-else branch
        if (shouldRun) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is unreachable");
        }
        // Mutation: Adding an unreachable switch case
        switch (value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This is the default case");
                break;
        }
        return c;
    }
}