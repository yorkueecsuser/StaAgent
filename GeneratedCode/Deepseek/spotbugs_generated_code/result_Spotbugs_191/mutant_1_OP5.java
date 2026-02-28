public static String performSensitiveOperation() {
    boolean shouldRun = getCondition(); // This method should return false to make the switch unreachable
    switch (shouldRun? 1 : 0) {
        case 1:
            System.out.println("This should never be printed");
            break;
    }
    return "Performing sensitive operation with data: " + sensitiveData;
}

private static boolean getCondition() {
    return false;
}