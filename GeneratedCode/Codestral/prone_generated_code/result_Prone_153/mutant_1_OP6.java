public void showBug(String... args) {
    if (args.length % 2!= 0) {
        throw new IllegalArgumentException("Method must be called with an even number of arguments");
    }

    // Added unreachable for loop
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
        System.out.println("This line should never be reached");
    }

    // Process the arguments in pairs
}