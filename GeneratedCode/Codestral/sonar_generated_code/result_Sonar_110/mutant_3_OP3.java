class NullPointerDereference {
    private String message;

    public void showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This block will never be executed.");
        }
        System.out.println(message.length()); // Original code
    }

    private boolean getCondition() {
        return false;
    }
}