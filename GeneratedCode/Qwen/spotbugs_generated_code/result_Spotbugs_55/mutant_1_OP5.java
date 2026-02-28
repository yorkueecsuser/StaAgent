class NullPointerExample {

    public void showBug() {
        String str = null;
        int length = str.length(); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)

        // Unreachable switch statement mutation
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This is unreachable code.");
                break;
            default:
                System.out.println("This is also unreachable code.");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the switch condition is dynamically determined but always evaluates to false
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