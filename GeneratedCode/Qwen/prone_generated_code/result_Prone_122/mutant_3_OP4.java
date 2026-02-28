class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        int x = flag? foo : null; // BUG: NullTernary

        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            x = 42; // This branch is unreachable because getCondition() always returns false
        } else {
            x = 24; // This branch is also unreachable because getCondition() always returns false
        }

        return x;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if-else branches unreachable
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