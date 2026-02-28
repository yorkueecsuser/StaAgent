class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is an unreachable branch.");
        } else {
            System.out.println("This is also an unreachable branch.");
        }
        
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}