class NullPointerDereference {
    private String message;

    public void showBug() {
        if (isUnreachableCondition()) {
            System.out.println("This branch is unreachable");
        }
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    }

    private boolean isUnreachableCondition() {
        return false;
    }
}