public static int showBug(int y) {
    new StaticField(y);

    // Mutation: Inserting unreachable switch statement
    int unreachableValue = getUnreachableValue();
    switch(unreachableValue) {
        case 1:
            System.out.println("This code should not be executed.");
            break;
        default:
            break;
    }

    return x;
}

// Method to return an unreachable value
private static int getUnreachableValue() {
    return -1; // This value is never returned by any other method, making the switch statement unreachable
}