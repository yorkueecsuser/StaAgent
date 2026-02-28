class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        boolean condition = getCondition();
        switch(condition) {
            case true:
                // This case is intentionally left empty to make the switch statement unreachable
                break;
        }

        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}