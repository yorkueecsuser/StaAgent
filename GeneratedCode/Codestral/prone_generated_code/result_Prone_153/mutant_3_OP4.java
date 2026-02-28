class EvenArgumentsMethod {
    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // Original code
        }

        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable branch
            System.out.println("This branch is unreachable");
        } else {
            // Process the arguments in pairs
        }
    }
}