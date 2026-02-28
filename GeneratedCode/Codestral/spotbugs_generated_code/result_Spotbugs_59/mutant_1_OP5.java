class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        System.out.println(message.toUpperCase());

        // Mutation Operator: Unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("This line is unreachable!");
                break;
        }
    }

    private int getValue() {
        // This method returns 0, which makes the switch statement in showBug() unreachable.
        return 0;
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        bug.showBug();
    }
}