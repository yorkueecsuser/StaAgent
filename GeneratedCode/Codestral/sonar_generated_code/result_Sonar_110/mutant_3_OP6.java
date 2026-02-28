class NullPointerDereference {
    private String message;

    public void showBug() {
        System.out.println(message.length());
        boolean condition = getCondition(); // Added method to dynamically determine the condition
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This code is unreachable");
        }
    }

    private boolean getCondition() { // Dummy method to return false
        return false;
    }
}