class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        int x = flag? foo : null; // BUG: NullTernary

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                x = 42; // This case is unreachable because condition is never true
                break;
            default:
                // Do nothing
                break;
        }

        return x;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the switch statement unreachable
    }

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println(example.showBug(false, 10));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}