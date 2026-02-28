class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        boolean condition = getCondition();
        switch(condition) {
            case true: // This case is unreachable because getCondition() always returns false
                System.out.println("This is an unreachable case");
                break;
        }
        
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }

    private boolean getCondition() {
        return false; // Ensures the switch case remains unreachable
    }
}