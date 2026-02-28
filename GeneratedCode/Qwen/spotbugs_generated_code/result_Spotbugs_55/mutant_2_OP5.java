class NullPointerExample {

    public void showBug() {
        String str = null;
        int length = str.length(); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This will never be printed");
                break;
            case 1:
                // This case is always executed
                System.out.println("This will always be printed");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement's first case unreachable
        return false;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            example.showBug();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}