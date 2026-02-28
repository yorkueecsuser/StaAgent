class NullPointerDereference {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // Original code

        // Mutant code
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line will never be executed");
        }
    }
}