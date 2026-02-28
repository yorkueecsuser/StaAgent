void mutateArray() {
    int[] array = getTestArray();
    array[2] = 7;  // BUG: MODIFIES_IMMUTABLE
    // Adding an unreachable while loop
    while(false) {
        System.out.println("This is an unreachable while loop.");
    }
}