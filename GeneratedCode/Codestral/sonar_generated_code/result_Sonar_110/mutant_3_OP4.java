class NullPointerDereference {
    private String message;

    public void showBug() {
        if (getUnreachableCondition()) {
            System.out.println("This is an unreachable branch");
        } else {
            System.out.println(message.length());
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}