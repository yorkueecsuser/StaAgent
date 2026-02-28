class NullPointerDereference {
    private String message;

    public void showBug() {
        boolean condition = falseCondition();
        switch (condition? 1 : 0) {
            case 1:
                System.out.println("Unreachable Code");
                break;
            default:
                System.out.println(message.length());
        }
    }

    private boolean falseCondition() {
        return false;
    }
}