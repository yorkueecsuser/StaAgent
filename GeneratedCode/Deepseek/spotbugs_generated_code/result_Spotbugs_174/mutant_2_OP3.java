public static int[] getNumbers() {
    if (getCondition()) { // This if statement is unreachable; getCondition() always returns false
        throw new RuntimeException("This statement should never be reached");
    }
    return numbers;
}

private static boolean getCondition() {
    return false;
}