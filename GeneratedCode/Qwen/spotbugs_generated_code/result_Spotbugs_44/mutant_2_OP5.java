class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This is unreachable");
                break;
            case 1:
                // This case is always executed
                System.out.println("This is reachable");
                break;
        }

        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    private boolean getCondition() {
        return false; // This method ensures the switch condition is never true
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}