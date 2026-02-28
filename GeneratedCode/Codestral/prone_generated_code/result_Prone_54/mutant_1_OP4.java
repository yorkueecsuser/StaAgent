public static void showBug() {
   ...
    // Adding unreachable if-else statement
    if (isUnreachableCondition()) {
        System.out.println("This code is unreachable.");
    } else {
        System.out.println("This code is always executed.");
    }
}

// A helper method to return an unreachable condition
private static boolean isUnreachableCondition() {
    return false;
}